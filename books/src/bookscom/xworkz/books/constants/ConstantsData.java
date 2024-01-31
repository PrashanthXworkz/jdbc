package bookscom.xworkz.books.constants;

public enum ConstantsData {
	
	URL("jdbc:mysql://localhost:3306/books"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	
	private String value;

	private ConstantsData(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	
}
