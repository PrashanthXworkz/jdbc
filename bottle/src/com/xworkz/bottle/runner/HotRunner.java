package com.xworkz.bottle.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import bottlecom.xworkz.bottle.constants.ConstantData;

public class HotRunner {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue())){
  System.out.println("connection is success");

  java.sql.Statement statement=connection.createStatement();

   String query="INSERT INTO bottle_info VALUES(8, 'Plastic', 'White', 550, 'MNO Ltd.', '2022-08-12')";

     statement.execute(query);


    } catch (SQLException e) {
        System.out.println("connection is not  success");
        e.printStackTrace();
      }

	}

}
