package week3.day2;

import java.util.List;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllIncidentsWithValidation 
{

	@Test
	public void getAllIncidents()
	{
		//Endpoint
		RestAssured.baseURI = "https://dev153437.service-now.com/api/now/table/incident";
						
		//Authentication
						
		RestAssured.authentication = RestAssured.basic("admin", "cw$v0%2bAQAR");
				
		//Add a single Query Parameter
		RequestSpecification input = RestAssured.given().queryParam("sysparm_fields", "short_description,sys_id");
				
		//Send Request
		Response response = input.get();
		List<Object> sysidList = response.jsonPath().getList("result.sys_id");
		System.out.println("Total Number of Incidents : " + sysidList.size());
		
		response.then().assertThat().body("result.short_description", Matchers.hasItem("Updated Via RestAssured"));
		response.prettyPrint();
		
	}
}
