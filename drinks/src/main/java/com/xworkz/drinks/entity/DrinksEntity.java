package com.xworkz.drinks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name=("drinks"))

public class DrinksEntity {
	
	@Id
	@Column(name=("id"))
	private int id;
	@Column(name=("drink_name"))
	private String drink_name;
	@Column(name=("no_of_varieties"))
	private int no_of_varities;
	@Column(name=("manufacture_location"))
	private String manufacture_location;
	
	public DrinksEntity() {
		System.out.println("no-args constructor");	}

}
