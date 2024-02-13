package com.xworkz.directors.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.directors.constants.ConstantData;

public class ReadRunner {

	public static void main(String[] args) {
     String query="SELECT * FROM directors";
		
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue());
				PreparedStatement preparedstatement=connection.prepareStatement(query)){
			
                System.out.println("connection is success");
                
                ResultSet resultSet = preparedstatement.executeQuery(query);
                
                while (resultSet.next()) {
                    String column1Value = resultSet.getString("directors_name");
                    String column2Value = resultSet.getString("Movie");
                    int column3Value = resultSet.getInt("age");
                    
                }
                

            } catch (SQLException e) {
               System.out.println("connection is not  success");
               e.printStackTrace();
             }

	}

}
