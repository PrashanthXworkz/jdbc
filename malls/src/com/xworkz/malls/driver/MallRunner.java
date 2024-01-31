package com.xworkz.malls.driver;

public class MallRunner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e){
				e.printStackTrace();
			}

	}

}
