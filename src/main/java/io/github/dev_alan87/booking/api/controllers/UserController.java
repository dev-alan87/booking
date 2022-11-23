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

@Scope(value = "session")
@Component("userController")
@ELBeanName("userController")
@Join(path = "/users", to = "user-form.xhtml")
public class UserController {

	@Autowired
	private UserRepository repository;

	private User user;
	private List<User> list;
	private String redirect = "/user-form.xhtml?faces-redirect=true";

	public UserController(UserRepository repository) {
		this.repository = repository;
		user = new PersonalUser();
		list = new ArrayList<>();
	}

	public String save() { 
		if(!list.contains(user)) {
			list.add(user);
			user = new PersonalUser();
		}
			
		return redirect;
	}
	public String update() {
		return redirect;
	}
	public String delete() {
		if(list.contains(user)) {
			list.remove(user);
			user = new PersonalUser();
		}
		return redirect;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}

}
