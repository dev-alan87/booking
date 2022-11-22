package io.github.dev_alan87.booking.domain.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "tb_daily_room")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) @DiscriminatorColumn(name = "type")
@Data @AllArgsConstructor @NoArgsConstructor
public abstract class DailyRoom {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private LocalDate date;
	
	@ManyToOne
	private Room room;
}
