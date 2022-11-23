package io.github.dev_alan87.booking.domain.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "TB_USER")
@Inheritance(strategy = InheritanceType.JOINED)
@Data @AllArgsConstructor @NoArgsConstructor
public abstract class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	@Column(unique = true, nullable = false)
	private String email;
	
	private String phone;
	
	@Embedded
	private Login login;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<SingleDaily> singles;
	
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Reservation> reservations;
	
	@Override
	public boolean equals(Object object) {
		try {
			if(object!=null) {
				User u = (User)object;
				return this.email.equals(u.email);
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
