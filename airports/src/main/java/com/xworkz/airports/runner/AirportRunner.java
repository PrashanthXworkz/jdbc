package com.xworkz.airports.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class AirportRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		EntityTransaction entitytranscation=entitymanager.getTransaction();
		System.out.println("this is connected");
		try {
			entitytranscation.begin();
			Query query=entitymanager.createQuery("UPDATE AirportEntity entity SET entity.location=:updateBylocation  where entity.airport_code=:updateBycode");
			query.setParameter("updateBylocation","Banglore,India");
			query.setParameter("updateBycode","ATL");
			query.executeUpdate();
		    entitytranscation.commit();
		  }catch(PersistenceException exception){
			  System.out.println("this is not connected");
			  entitytranscation.isActive();
			  entitytranscation.rollback();
		  }finally {
			  entitymanager.close();
			  entityManagerFactory.close();
		  }

	}

}
