package com.xworkz.crocks.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.crocks.entity.CrocksEntity;

public class ShoesRunner {

	public static void main(String[] args) {
		EntityManagerFactory entitymangerfactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entitymangerfactory.createEntityManager();
		EntityTransaction entitytransction=entitymanager.getTransaction();
		try {
			entitytransction.begin();
			Query query=entitymanager.createNamedQuery("findbyname");
			query.setParameter("brandNameby","Bata");
			Object obj=query.getSingleResult();
			String date=(String)obj;
			entitytransction.commit();
		    System.out.println("date======="+date);
			
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
