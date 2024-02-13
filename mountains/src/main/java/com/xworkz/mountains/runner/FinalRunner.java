package com.xworkz.mountains.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.mountains.constants.ConstantData;

public class FinalRunner {

	public static void main(String[] args) {
String query="INSERT INTO mountain(mountain_name,no_of_mountains,mountain_location,mountain_degree) VALUES(?,?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue());
				PreparedStatement preparedstatement=connection.prepareStatement(query)){
                System.out.println("connection is success");
                preparedstatement.setString(1,"zpoint");
                preparedstatement.setInt(2,10);
                preparedstatement.setString(3,"Kemmangundi");
                preparedstatement.setFloat(4,(float)25.6);
                
                preparedstatement.executeUpdate();
                
          } catch (SQLException e) {
               System.out.println("connection is not  success");
               e.printStackTrace();
             }

	}

}
