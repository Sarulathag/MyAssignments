package week3.day2;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateIncidentWithFileBody 
{

	@Test
	public void update()
	{
		//Endpoint
		RestAssured.baseURI = "https://dev153437.service-now.com/api/now/table/incident";
				
		//Authentication
		
		RestAssured.authentication = RestAssured.basic("admin", "cw$v0%2bAQAR");
		
		File fileName = new File("./src/test/resources/UpdateIncident.json");
		
		//AddRequest
		
		RequestSpecification input = RestAssured.given()
		.contentType("application/json")
		.when()
		.body(fileName);
		
		//Send Request
		
		Response response = input.put("/7a4e7f5c47a57110a0c35882e36d4330");
		int statusCode = response.getStatusCode();
		System.out.println("The Status Code is : "+statusCode);
		response.prettyPrint();
		
		response.then().assertThat().statusCode(Matchers.equalTo(200));
	}
}
