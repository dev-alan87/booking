package io.github.dev_alan87.booking.domain.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.github.dev_alan87.booking.domain.entities.enums.RoomType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "tb_room")
@Data @AllArgsConstructor @NoArgsConstructor
public class Room {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String number;
	
	@Enumerated(EnumType.STRING)
	private RoomType type;
	
	@OneToMany(mappedBy = "room")
	private List<DailyRoom> dailys;
}