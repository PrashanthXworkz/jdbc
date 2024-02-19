package com.xworkz.directors.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DirectionRunner {

	public static void main(String[] args) {
	
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("com.xworkz");

	}

}
