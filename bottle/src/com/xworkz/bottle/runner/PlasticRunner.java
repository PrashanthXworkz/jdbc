package com.xworkz.bottle.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import bottlecom.xworkz.bottle.constants.ConstantData;

public class PlasticRunner {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue())){
  System.out.println("connection is success");

  java.sql.Statement statement=connection.createStatement();

   String query="INSERT INTO bottle_info VALUES(3, 'Metal', 'Red',700, 'DEF Manufacturing', '2022-03-10')";

     statement.execute(query);


    } catch (SQLException e) {
        System.out.println("connection is not  success");
        e.printStackTrace();
      }

	}

}
