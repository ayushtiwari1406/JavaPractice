package com.education.Files;

public class Payload {
	
	
	
	public static String addBook(String isbnNo, String aisleNo) {
		
		String addBook = "{\r\n"
				+ "  \"name\": \"Learn Appium Automation with Java\",\r\n"
				+ "  \"isbn\": \""+isbnNo+"\",\r\n"
				+ "  \"aisle\": \""+aisleNo+"\",\r\n"
				+ "  \"author\": \"John foe\"\r\n"
				+ "}";
		return addBook;
	}
	
	public static String deleteBook(String isbnNo, String aisleNo) {
		
		String deleteBookID = isbnNo+aisleNo;
		
		System.out.println("*********BookId to be deleted*************:" + deleteBookID);
		String deleteBook = "{\r\n"
				+ "  \"ID\": \""+deleteBookID+"\"\r\n"
				+ "}";
		return deleteBook;
	}

}
