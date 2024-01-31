package com.xworkz.pen.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.pen.constants.Data;

public class ShineRunner {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(Data.URL.getValue(),
				Data.USERNAME.getValue(),Data.PASSWORD.getValue())){
			
			System.out.println("connection is success");
			
			Statement statement=connection.createStatement();
			
			String query="INSERT INTO pen_table values(12, 'Gold', 'Cross', 45.99)";
			
			statement.executeUpdate(query);
			
			
		} catch (SQLException e) {
			System.out.println("connection is not  success");
			e.printStackTrace();
		}
	}

}
