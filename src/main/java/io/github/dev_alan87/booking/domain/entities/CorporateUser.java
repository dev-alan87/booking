package io.github.dev_alan87.booking.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity @Table(name = "tb_user_corporate")
@PrimaryKeyJoinColumn(name = "id")
@Data @EqualsAndHashCode(callSuper = true)
@AllArgsConstructor @NoArgsConstructor
public class CorporateUser extends User {

	@Column(name = "rgstr_name")
	private String registerName;
	
	@Column(name = "doc_national_inscr")
	private String nationalInscriptionDocument;
	
	@Column(name = "doc_local_inscr")
	private String localInscriptionDocument;
	
}
