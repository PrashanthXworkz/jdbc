package com.xworkz.army.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.army.entity.ArmyEntity;

public class ArmyRunner {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		System.out.println("this is connected");
		try {
			entitytransaction.begin();
			ArmyEntity army=new ArmyEntity();
			army.setArmy_id(1);
			army.setName("John Doe");
			army.setRank("Captain");
			army.setAge(40);
			army.setUnit("Alpha Company");
			entitymanager.persist(army);
			entitytransaction.commit();
			
		}catch(Exception e){
			System.out.println("this is not connected");
			entitytransaction.isActive();
			entitytransaction.rollback();
			
		}finally {
			entitymanager.close();
			entitymanagerfactory.close();
			
		}

	}

}
