package io.github.dev_alan87.booking.domain.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data @NoArgsConstructor @AllArgsConstructor
public class Address {
	
	@Column(name = "addr_street")
	private String street;
	
	@Column(name = "addr_number")
	private String number;
	
	@Column(name = "addr_complement")
	private String complement;
	
	@Column(name = "addr_district")
	private String district;
	
	@Column(name = "addr_providence")
	private String province;
	
	@Column(name = "addr_code")
	private String code;
	
	@Column(name = "addr_country")
	private String country;
	
}
