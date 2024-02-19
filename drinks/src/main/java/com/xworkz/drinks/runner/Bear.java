package com.xworkz.drinks.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.entity.DrinksEntity;

public class Bear {

	public static void main(String[] args) {
		 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
			EntityManager entitymanager=entityManagerFactory.createEntityManager();
			EntityTransaction entitytranscation=entitymanager.getTransaction();
			
			try {
				entitytranscation.begin();
				DrinksEntity entity=new DrinksEntity();
				entity.setId(5);
				entity.setDrink_name("soda");
				entity.setNo_of_varities(3);
				entity.setManufacture_location("kerala");
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
