package com.xworkz.fan.driver;

public class FanRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e){
				e.printStackTrace();
			}

	}

}
