package com.xworkz.bottle.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import bottlecom.xworkz.bottle.constants.ConstantData;

public class CoverRunner {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(ConstantData.URL.getValue(),
                ConstantData.USERNAME.getValue(),
                ConstantData.PASSWORD.getValue())){
  System.out.println("connection is success");

  java.sql.Statement statement=connection.createStatement();

   String query="INSERT INTO bottle_info VALUES(4, 'Glass', 'Clear', 300, 'LMN Industries', '2022-04-05')";

     statement.execute(query);


    } catch (SQLException e) {
        System.out.println("connection is not  success");
        e.printStackTrace();
      }

	}

}
