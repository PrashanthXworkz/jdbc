package com.xworkz.birds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="birds")
public class BirdEntity {
	@Id
	@Column(name="bird_id")
	private int id;
	@Column(name=" species_name")
	private String name;
	@Column(name=" common_name")
	private String commonname;
	@Column(name=" habitat")
	private String habitat;
	@Column(name="average_wingspan")
	private int wingspan;
	
	public BirdEntity() {
		System.out.println("no-args constructor");
	}

}
