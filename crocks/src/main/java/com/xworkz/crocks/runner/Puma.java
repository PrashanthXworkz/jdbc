package com.xworkz.crocks.runner;

import java.util.List;
import java.util.Objects;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class Puma {

	public static void main(String[] args) {
		EntityManagerFactory entitymangerfactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entitymangerfactory.createEntityManager();
		EntityTransaction entitytransction=entitymanager.getTransaction();
		try {
			entitytransction.begin();
			
			 Query query = entitymanager.createNamedQuery("finddateandpricebyname");
		     query.setParameter("brandNameby", "paragon");
             Object[] result = (Object[]) query.getSingleResult();
		     String date = (String) result[0];
		     int value = (int) result[1];
            entitytransction.commit();
		    System.out.println("manufacture date and price======"+date+"   "+value);
			
		}catch(PersistenceException exception) {
			System.out.println("this is not connected");
			entitytransction.isActive();
			entitytransction.rollback();
		}finally {
			entitymanager.close();
			entitymangerfactory.close();
			
		}

	}

}
