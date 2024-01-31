package com.xworkz.books.runner;

import java.sql.Connection;
import java.sql.DriverManager;

import bookscom.xworkz.books.constants.ConstantsData;

public class PagesRunner {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConstantsData.URL.getValue(),
				ConstantsData.USERNAME.getValue(),
				ConstantsData.PASSWORD.getValue())){
			System.out.println("connection success");
			
			java.sql.Statement statement=connection.createStatement();
			
			String query="INSERT INTO book_table(bookname,bookauthor) values('Data Structure','Arjun U')";
			
			statement.execute(query);
			
			}catch(Exception e) {
			System.out.println("connection is not success");
		    e.printStackTrace();
			
			
		}

	}

}
