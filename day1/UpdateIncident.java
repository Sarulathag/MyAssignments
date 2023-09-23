package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncident
{

	@Test
	public void update()
	{
		//Endpoint
		RestAssured.baseURI = "https://dev153437.service-now.com/api/now/table/incident";
				
		//Authentication
		
		RestAssured.authentication = RestAssured.basic("admin", "cw$v0%2bAQAR");
		
		//AddRequest
		
		RequestSpecification input = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\"short_description\":\"Updated from RestAssured\"}");
		
		//Send Request
		
		Response response = input.put("/4c82cbc047613110a0c35882e36d43c9");
		int statusCode = response.getStatusCode();
		System.out.println("The Status Code is : "+statusCode);
		response.prettyPrint();
	}
}
