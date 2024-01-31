package com.xworkz.bottle.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import bottlecom.xworkz.bottle.constants.ConstantData;

public class BottleRunner{
	public static void main(String []args) {
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
				                 ConstantData.USERNAME.getValue(),
				                 ConstantData.PASSWORD.getValue())){
			System.out.println("connection is success");
			
			java.sql.Statement statement=connection.createStatement();
			
			String query="INSERT INTO bottle_info VALUES(1, 'Glass', 'Blue', 500, 'IBM Company', '2022-01-01')";
			
			statement.execute(query);
			
			
		} catch (SQLException e) {
			System.out.println("connection is not  success");
			e.printStackTrace();
		}
	}
}
