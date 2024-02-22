package com.xworkz.branches.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class College {

	public static void main(String[] args) {
		EntityManagerFactory entitymangerfactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entitymangerfactory.createEntityManager();
		EntityTransaction entitytransction=entitymanager.getTransaction();
		try {
			entitytransction.begin();
			Query query=entitymanager.createNamedQuery("findbranch");
			query.setParameter("branchNameby","Computer Science");
			Object obj=query.getSingleResult();
			int dept=(int)obj;
			entitytransction.commit();
		    System.out.println("value======="+dept);
			
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
