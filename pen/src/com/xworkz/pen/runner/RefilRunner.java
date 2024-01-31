package com.xworkz.pen.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.pen.constants.Data;

public class RefilRunner {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(Data.URL.getValue(),
				Data.USERNAME.getValue(),Data.PASSWORD.getValue())){
			
			System.out.println("connection is success");
			
			Statement statement=connection.createStatement();
			
			String query="INSERT INTO pen_table values(15, 'Cyan', 'Rotring', 22.49)";
			
			statement.executeUpdate(query);
			
			
		} catch (SQLException e) {
			System.out.println("connection is not  success");
			e.printStackTrace();
		}

	}

}
