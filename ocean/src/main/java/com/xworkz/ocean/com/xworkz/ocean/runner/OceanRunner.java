package com.xworkz.ocean.com.xworkz.ocean.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.ocean.constants.ConstantData;

public class OceanRunner {

	public static void main(String[] args) {
String query="INSERT INTO ocean(ocean_name,visited_people,location) VALUES(?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue());
				PreparedStatement preparedstatement=connection.prepareStatement(query)){
                System.out.println("connection is success");
                preparedstatement.setString(1,"om");
                preparedstatement.setInt(2, 100);
                preparedstatement.setString(3,"Manglore");
                
                preparedstatement.executeUpdate();
                

            } catch (SQLException e) {
               System.out.println("connection is not  success");
               e.printStackTrace();
             }

	}

}
