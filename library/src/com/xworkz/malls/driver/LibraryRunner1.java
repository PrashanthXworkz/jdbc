package com.xworkz.malls.driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class LibraryRunner1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/library";
		String userName="root";
		String password="Xworkzodc@123";
		
		try(Connection connection=DriverManager.getConnection(url, userName, password)){
			if(connection!=null) {
				System.out.println("connection success");
				}
			else {
				System.out.println("connection failed");
			}
		}catch(Exception e) {
			
		}

	}

}
