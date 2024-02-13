package com.xworkz.directors.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.directors.constants.ConstantData;

public class MovieRunner {

	public static void main(String[] args) {
      String query="INSERT INTO directors(directors_name,movie,age) VALUES(?,?,?)";
		
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue());
				PreparedStatement preparedstatement=connection.prepareStatement(query)){
			
                System.out.println("connection is success");
                
                preparedstatement.setString(1,"John Ford");
                preparedstatement.setString(2,"Ford");
                preparedstatement.setFloat(3, 45);;
                
                preparedstatement.executeUpdate();
                

            } catch (SQLException e) {
               System.out.println("connection is not  success");
               e.printStackTrace();
             }

	}

}
