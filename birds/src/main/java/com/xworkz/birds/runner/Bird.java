package com.xworkz.birds.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class Bird {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		EntityTransaction entitytranscation=entitymanager.getTransaction();
		System.out.println("this is connected");
		try {
			entitytranscation.begin();
			Query query=entitymanager.createQuery("UPDATE BirdEntity entity SET entity.wingspan=:updateBywings  where entity.id=:updateByid");
			query.setParameter("updateBywings",45);
			query.setParameter("updateByid",6);
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
