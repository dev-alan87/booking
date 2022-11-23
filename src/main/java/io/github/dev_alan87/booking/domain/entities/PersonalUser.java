package io.github.dev_alan87.booking.domain.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import io.github.dev_alan87.booking.domain.entities.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity @Table(name = "tb_user_personal")
@PrimaryKeyJoinColumn(name = "id")
@Data @EqualsAndHashCode(callSuper = true)
@AllArgsConstructor @NoArgsConstructor
public class PersonalUser extends User {
	
	@Column(name = "social_name")
	private String socialName;
	
	private LocalDate birthday;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private String passport;
	
	@Column(name = "national_document")
	private String nationalDocument;
}
