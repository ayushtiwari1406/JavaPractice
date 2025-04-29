package com.education.LibraryAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.education.Files.Payload;
import com.education.Files.ReusableMethod;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJson {

	@Test(dataProvider="BookData",priority=0)
	public void addBook(String aisle,String isbn) {
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		String resp = given()
		.header("Content-Type","application/json")
		.body(Payload.addBook(aisle,isbn)).log().all()
		.when()
		.post("/Library/Addbook.php")
		.then()
		.assertThat().statusCode(200).log().all()
		.extract().response().asString();
		
		JsonPath js = ReusableMethod.rawToJSON(resp);
		
		String id = js.get("ID");
		
		System.out.println("ID is: "+ id);
	
	}
	
	@DataProvider(name="BookData")
	public Object[][] getData() {
		return new Object[][] {{"Science","111"},{"Socialscience","222"},{"Economics","333"}};
	}
	
	@Test(dataProvider="BookData",priority=1)
	public void deleteBook(String aisle,String isbn) {
		
		String deleteBook = given()
		.log().all()
		.header("Content-Type","application/json")
		.body(Payload.deleteBook(aisle,isbn))
		.when()
		.post("/Library/DeleteBook.php")
		.then()
		.assertThat().statusCode(200).extract().response().asString();
		System.out.println("Delete Book response" + deleteBook);
		
		
		
	}
	@Test(priority=2)
	public void addPlaceWithJSONFile() throws IOException {
		
		RestAssured.baseURI = "http://216.10.245.166";
		String JsonFile = "D:\\Eclipse\\Eclipse-WorkSpace\\APITesting_LibraryAPI\\LibraryAPI\\src\\test\\java\\com\\education\\Files\\\\AddPaylaod.json";
		String resp = given()
		.header("Content-Type","application/json")
		.body(Files.readAllBytes(Paths.get(new String(JsonFile)))).log().all()
		.when()
		.post("/Library/Addbook.php")
		.then()
		.assertThat().statusCode(200).log().all()
		.extract().response().asString();
		
		JsonPath js = ReusableMethod.rawToJSON(resp);
		
		String id = js.get("ID");
		
		System.out.println("ID is: "+ id);
	
	}
}







