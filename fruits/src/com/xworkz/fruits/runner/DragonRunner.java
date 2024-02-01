package com.xworkz.fruits.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.constant.ConstantData;

public class DragonRunner {

	public static void main(String[] args) {
		 String query="INSERT INTO fruits(fruit_name,fruit_sale,no_of_fruits) VALUES(?,?,?)";
			
			try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
	                ConstantData.USERNAME.getValue(),
	                ConstantData.PASSWORD.getValue());
					PreparedStatement preparedstatement=connection.prepareStatement(query)){
	                System.out.println("connection is success");
	                preparedstatement.setString(1,"Banana");
	                preparedstatement.setString(2,"2023-11-25");
	                preparedstatement.setDouble(3,120);
	                
	                preparedstatement.executeUpdate();
	                

	            } catch (SQLException e) {
	               System.out.println("connection is not  success");
	               e.printStackTrace();
	             }
	}

}
