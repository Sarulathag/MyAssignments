package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident 
{

	@Test
	public void create()
	{
		//Endpoint
		RestAssured.baseURI = "https://dev153437.service-now.com/api/now/table/incident";
		
		//Authentication
		
		RestAssured.authentication = RestAssured.basic("admin", "cw$v0%2bAQAR");
		
		//AddRequest
		
		RequestSpecification input = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\"description\":\"Laptop not working\",\"short_description\":\"Windows\"}");
		
		//send Request
		Response response = input.post();
		String sys_id = response.jsonPath().get("result.sys_id");
		System.out.println("The Sys_Id is : "+sys_id);
		int statusCode = response.getStatusCode();
		System.out.println("The Status Code is : "+statusCode);
		response.prettyPrint();
	}
}
