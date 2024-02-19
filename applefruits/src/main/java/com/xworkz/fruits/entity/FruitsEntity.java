package com.xworkz.fruits.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name=("fruits"))

public class FruitsEntity {
	@Id
	@Column(name=("fruit_id"))
	private int fruit_id;
	
	@Column(name=("fruit_name"))
   private String fruit_name;
   
	@Column(name=("color"))
   private String color;
   
	@Column(name=("price"))
   private int price;
	
	public  FruitsEntity() {
		System.out.println("no-args constructor");
	}

}