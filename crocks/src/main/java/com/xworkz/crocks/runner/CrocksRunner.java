package com.xworkz.crocks.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.crocks.entity.CrocksEntity;

public class CrocksRunner {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entityManagerFactory.createEntityManager();
		EntityTransaction entitytranscation=entitymanager.getTransaction();
		System.out.println("this is connected");
		try {
			entitytranscation.begin();
			Query query=entitymanager.createNamedQuery("nameBy");
			query.setParameter("brandNameby","Bata");
			Object obj=query.getSingleResult();
			CrocksEntity entity=(CrocksEntity) obj;
		    entitytranscation.commit();
		    System.out.println(entity);
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
