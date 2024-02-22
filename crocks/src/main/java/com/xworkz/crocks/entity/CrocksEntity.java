package com.xworkz.crocks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="crocks")
@NamedQuery(name="nameBy",query="SELECT entity FROM CrocksEntity entity WHERE entity.brandName=:brandNameby")
@NamedQuery(name="findbyname",query="SELECT entity.manufactureDate FROM CrocksEntity entity WHERE entity.brandName=:brandNameby")
@NamedQuery(name="findpricebyname",query="SELECT entity.price FROM CrocksEntity entity WHERE entity.brandName=:brandNameby")
@NamedQuery(name="finddateandpricebyname",query="SELECT entity.manufactureDate,entity.price FROM CrocksEntity entity WHERE entity.brandName=:brandNameby ")
public class CrocksEntity {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="brand_name")
	private String brandName;
	@Column(name="manufacture_date")
	private String manufactureDate;
	@Column(name="price")
	private int price;
	
	public CrocksEntity() {
		System.out.println("no-args constructor");
	}

}
