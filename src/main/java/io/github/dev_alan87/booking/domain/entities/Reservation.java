package io.github.dev_alan87.booking.domain.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "tb_reservation")
@Data @AllArgsConstructor @NoArgsConstructor
public class Reservation {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private LocalDate date;
	
	@Column(precision = 10, scale = 2)
	private double price;
	
	@ManyToOne
	private User client;
	
	@OneToMany(mappedBy = "reservation", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<ReservatedDaily> dailys;
}
