package com.xworkz.bottle.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import bottlecom.xworkz.bottle.constants.ConstantData;

public class WaterBottle {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
				ConstantData.USERNAME.getValue(),ConstantData.PASSWORD.getValue())){
			System.out.println("connection is success");
			
			Statement statement=connection.createStatement();
			
			String query="UPDATE bottle_info SET material='Silver' where capacity=750";
			
			int result=statement.executeUpdate(query);
			if(result==1) {
				System.out.println("update success");
			}else {
				System.out.println("update is not  success");
			}
			
		} catch (SQLException e) {
			System.out.println("connection is not success");
			e.printStackTrace();
		}

	}

}
