package com.xworkz.charger.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.charger.constant.ConstantData;

public class ConnectionChargeRunner {

	public static void main(String[] args) {
		 String query="INSERT INTO charger(brand,model,max_power) VALUES(?,?,?)";
			
			try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
	                ConstantData.USERNAME.getValue(),
	                ConstantData.PASSWORD.getValue());
					PreparedStatement preparedstatement=connection.prepareStatement(query)){
	                System.out.println("connection is success");
	                preparedstatement.setString(1,"Echo Energy");
	                preparedstatement.setString(2,"Green Charge");
	                preparedstatement.setDouble(3,60);
	                
	                preparedstatement.executeUpdate();
	                

	            } catch (SQLException e) {
	               System.out.println("connection is not  success");
	               e.printStackTrace();
	             }

	}

}
