package io.github.dev_alan87.booking.domain.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data @AllArgsConstructor @NoArgsConstructor
public class Login {

	@Column(name = "login", nullable = false, unique = true)
	private String login;
	
	@Column(name = "login_password", nullable = false)
	private String password;
	
	@Column(name = "login_token")
	private String token;
	
}