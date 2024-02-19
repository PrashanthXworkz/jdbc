package com.xworkz.fruits.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.fruits.entity.FruitsEntity;

public class JuiceRunner {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		
		try {
			
			System.out.println("this is connected");
			 entitytransaction.begin();
			 FruitsEntity entity=new FruitsEntity();
			 entity.setFruit_id(2);
			 entity.setFruit_name("orange");
			 entity.setColor("yellow");
			 entity.setPrice(120);
			 
			 entitymanager.persist(entity);
			 entitytransaction.commit();
			 }catch(Exception e) {
				 entitytransaction.isActive();
				 entitytransaction.rollback();
				 System.out.println("this is not connected");
			
		}finally {
			entitymanager.close();
			entitymanagerfactory.close();
			
		}

	}

}
