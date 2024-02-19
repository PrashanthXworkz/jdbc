package com.xworkz.drinks.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.entity.DrinksEntity;

public class Enjoy {

	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
			EntityManager entitymanager=entityManagerFactory.createEntityManager();
			EntityTransaction entitytranscation=entitymanager.getTransaction();
			
			try {
				entitytranscation.begin();
				DrinksEntity entity=new DrinksEntity();
				entity.setId(6);
				entity.setDrink_name("savor");
				entity.setNo_of_varities(5);
				entity.setManufacture_location("sikkim");
				System.out.println("this is connected");
				entitymanager.persist(entity);
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
