package com.xworkz.branches.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class Institute {

	public static void main(String[] args) {
		EntityManagerFactory entitymangerfactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entitymangerfactory.createEntityManager();
		EntityTransaction entitytransction=entitymanager.getTransaction();
		try {
			entitytransction.begin();
			
			Query query = entitymanager.createNamedQuery("findnameandbranch");
	        query.setParameter("branchNameby", "Civil Engineering");

	        Object[] result = (Object[]) query.getSingleResult();
	        int value = (int) result[0];
	        String name= (String) result[1];
             entitytransction.commit();
		    System.out.println("hod name and branches======"+name+"   "+value);
			
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
