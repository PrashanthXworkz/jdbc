package com.xworkz.fruits.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.fruits.constant.ConstantData;

public class FruitsUpdate {

	public static void main(String[] args) {
		String query="UPDATE fruits SET no_of_fruits=? where fruits_id=?";
		
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue());
				PreparedStatement preparedstatement=connection.prepareStatement(query)){
                System.out.println("connection is success");
                preparedstatement.setInt(1, 140);
                preparedstatement.setInt(2, 3);;
                
                preparedstatement.executeUpdate();
                

            } catch (SQLException e) {
               System.out.println("connection is not  success");
               e.printStackTrace();
             }

	}

}
