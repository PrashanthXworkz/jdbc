package com.xworkz.airports.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="airports")
public class AirportEntity {
	@Id
	@Column(name="airport_code")
	private String airport_code ;
	@Column(name="airport_name")
    private String airport_name ;
	@Column(name="location")
    private String  location;
	@Column(name="runway_length")
    private int  runway_length ;
	@Column(name="terminal_count")
     private int terminal_count;
	
	public AirportEntity() {
		System.out.println("no-args constructor");
	}

}
