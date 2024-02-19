package com.xworkz.drinks.delete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.entity.DrinksEntity;

public class Happy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		EntityTransaction entitytranscation=entitymanager.getTransaction();
		
		 try {
				entitytranscation.begin();
				 DrinksEntity entity =entitymanager.find(DrinksEntity.class,6); 
				 if (entity != null) {
					 entitymanager.remove(entity);
		            } else {
		                System.out.println("Entity with id 6 not found.");
		            }
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
