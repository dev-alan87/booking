package io.github.dev_alan87.booking.domain.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("single")
@Data @EqualsAndHashCode(callSuper = false)
@AllArgsConstructor @NoArgsConstructor
public class SingleDaily extends DailyRoom {

	@Column(precision = 10, scale = 2)
	private Double price;
	
	@ManyToOne
	private User client;
}
