package com.xworkz.directors.constants;

public enum ConstantData {

	URL("jdbc:mysql://localhost:3306/directors_db"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private String value;

	private ConstantData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
