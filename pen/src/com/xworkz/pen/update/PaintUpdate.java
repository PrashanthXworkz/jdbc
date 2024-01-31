package com.xworkz.pen.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.pen.constants.Data;

public class PaintUpdate {

	public static void main(String[] args) {
		try(Connection connection=DriverManager.getConnection(Data.URL.getValue(),
				Data.USERNAME.getValue(),Data.PASSWORD.getValue())){
			System.out.println("connection is success");
			
			Statement statement=connection.createStatement();
			
			String query="UPDATE pen_table SET brand = 'like',price=20 WHERE Pen_id = 6";
			
			int result=statement.executeUpdate(query);
			if(result==1) {
				System.out.println("update is success");
			}else {
				System.out.println("update is not success");
			}
				
		} catch (SQLException e) {
			System.out.println("connection is not  success");
			e.printStackTrace();
		}

	}

}
