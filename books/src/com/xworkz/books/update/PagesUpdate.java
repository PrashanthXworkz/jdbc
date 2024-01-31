package com.xworkz.books.update;

import java.sql.Connection;
import java.sql.DriverManager;

import bookscom.xworkz.books.constants.ConstantsData;

public class PagesUpdate {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConstantsData.URL.getValue(),
				ConstantsData.USERNAME.getValue(),
				ConstantsData.PASSWORD.getValue())){
			System.out.println("connection success");
			
			java.sql.Statement statement=connection.createStatement();
			
			String query="UPDATE book_table SET bookauthor='Gokale' where bookauthor='Arjun U' ";
			
			boolean result=statement.execute(query);
			
			if(result) {
				System.out.println("query is not updated");
			}else{
				System.out.println("query is updated");
			}
			
			}
		    catch(Exception e) {
			System.out.println("connection is not success");
		    e.printStackTrace();
			}

	}

}
