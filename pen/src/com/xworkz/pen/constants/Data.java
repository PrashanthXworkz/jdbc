package com.xworkz.pen.constants;

public enum Data {

	URL("jdbc:mysql://localhost:3306/pen"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private String value;

	private Data(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	

}
