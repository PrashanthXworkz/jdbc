package com.xworkz.army.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name=("army_table"))
public class ArmyEntity {
	@Id
	@Column(name=("army_id"))
	
	private int army_id;
	
	@Column(name=("name"))
	private String name;
	
	@Column(name=("rank"))
	private String rank;
	
	@Column(name=("age"))
	private int age;
	
	@Column(name=("unit"))
	private String unit;
	
	
	public ArmyEntity() {
		System.out.println("no-args constructor");
	}

}
