package io.github.dev_alan87.booking.domain.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;

@Entity
@Inheritance @DiscriminatorValue("reservated")
public class ReservatedDaily extends DailyRoom {

	@ManyToOne
	private Reservation reservation;
	
}
