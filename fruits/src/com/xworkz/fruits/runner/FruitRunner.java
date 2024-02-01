package com.xworkz.fruits.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.constant.ConstantData;

public class FruitRunner {

	public static void main(String[] args) {
         String query="INSERT INTO fruits(fruit_name,fruit_sale,no_of_fruits) VALUES(?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue());
				PreparedStatement preparedstatement=connection.prepareStatement(query)){
                System.out.println("connection is success");
                preparedstatement.setString(1,"Apple");
                preparedstatement.setString(2,"2024-01-10");
                preparedstatement.setDouble(3,100);
                
                preparedstatement.executeUpdate();
                

            } catch (SQLException e) {
               System.out.println("connection is not  success");
               e.printStackTrace();
             }

	}

}
