package com.xworkz.plastic.driver;

public class PlasticRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e){
				e.printStackTrace();
			}
	}

}
