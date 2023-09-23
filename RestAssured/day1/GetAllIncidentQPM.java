package week3.day1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllIncidentQPM 
{

	@Test
	public void getAll()
	{
		Map<String,String> queryParams = new HashMap<String,String>();
		queryParams.put("sysparm_fields", "short_description,sys_id");
		queryParams.put("sysparm_limit", "10");
		
		//Endpoint
		RestAssured.baseURI = "https://dev153437.service-now.com/api/now/table/incident";
						
		//Authentication
						
		RestAssured.authentication = RestAssured.basic("admin", "cw$v0%2bAQAR");
		
		//Send Request
		RequestSpecification input = RestAssured.given()
		.queryParams(queryParams);
		
		
		Response response = input.get();
		
		response.prettyPrint();
				
	}
}
