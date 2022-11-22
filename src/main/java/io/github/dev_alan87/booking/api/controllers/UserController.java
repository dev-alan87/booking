package io.github.dev_alan87.booking.api.controllers;

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
	
	private User user = new PersonalUser();
	
	public UserController(UserRepository repository) {
		this.repository = repository;
	}
	
	public String save() {
		this.repository.save(user);
		user = new PersonalUser();
		return "user-form.jsf?faces-redirect=true";
	}
	
	public User getUser() {
		return this.user;
	}
	
	
	
}
