package com.xworkz.army.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.army.entity.ArmyEntity;

public class Soldier {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entitymanager=entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction=entitymanager.getTransaction();
		System.out.println("this is connected");
		try {
			entitytransaction.begin();
			ArmyEntity army=new ArmyEntity();
			army.setArmy_id(2);
			army.setName("Rajappa Iyer");
			army.setRank("private");
			army.setAge(30);
			army.setUnit("buzz Company");
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
