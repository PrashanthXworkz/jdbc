package com.xworkz.birds.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class Fly {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		EntityTransaction entitytranscation=entitymanager.getTransaction();
		System.out.println("this is connected");
		try {
			entitytranscation.begin();
			Query query=entitymanager.createQuery("UPDATE BirdEntity entity SET entity.commonname=:updateByname  where entity.id=:updateByid");
			query.setParameter("updateByname","rajgir");
			query.setParameter("updateByid",3);
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
