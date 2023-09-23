package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllIncidentQPS 
{

	@Test
	public void getAll()
	{
		//Endpoint
		RestAssured.baseURI = "https://dev153437.service-now.com/api/now/table/incident";
						
		//Authentication
						
		RestAssured.authentication = RestAssured.basic("admin", "cw$v0%2bAQAR");
		
		//Send Request
		RequestSpecification input = RestAssured.given()
		.queryParam("sysparm_fields", "short_description,sys_id")
		.queryParam("sysparm_limit", "10");
		
		Response response = input.get();
		
		response.prettyPrint();
				
	}
}
