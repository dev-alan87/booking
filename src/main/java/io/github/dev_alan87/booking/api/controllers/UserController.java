package io.github.dev_alan87.booking.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.github.dev_alan87.booking.domain.entities.PersonalUser;
import io.github.dev_alan87.booking.domain.entities.User;
import io.github.dev_alan87.booking.domain.repositories.UserRepository;
import lombok.Data;

@Scope(value = "session")
@Component("userController")
@ELBeanName("userController")
@Join(path = "/users", to = "user-form.xhtml")
@Data
public class UserController {

	@Autowired
	private UserRepository repository;

	private User user;
	private List<User> list;

	public UserController(UserRepository repository) {
		this.repository = repository;

		this.user = new PersonalUser();

		this.list = new ArrayList<>();

		loadList();
	}

	public void save() {
		list.add(user);
	}

	private void loadList() {
		User aux;
		for (int i = 0; i < 10; i++) {
			aux = new PersonalUser();
			aux.setName(String.format("User %02d", i));
			aux.setEmail(String.format("user%02d@user.com", i));
			aux.setPhone(String.format("+55 11 99999-99%02d", i));

			this.list.add(aux);
		}
	}

}
