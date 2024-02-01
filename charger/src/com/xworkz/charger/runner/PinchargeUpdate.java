package com.xworkz.charger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charger.constant.ConstantData;

public class PinchargeUpdate {

	public static void main(String[] args) {
		String query="UPDATE charger SET brand=? where charger_id=?";
		
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue());
				PreparedStatement preparedstatement=connection.prepareStatement(query)){
                System.out.println("connection is success");
                preparedstatement.setString(1,"echorange");
                preparedstatement.setInt(2,3);;
                
                preparedstatement.executeUpdate();
                

            } catch (SQLException e) {
               System.out.println("connection is not  success");
               e.printStackTrace();
             }

	}

}
