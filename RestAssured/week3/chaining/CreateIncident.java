package chaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class CreateIncident extends BaseClass
{

	@Test
	public void create()
	{
		//AddRequest
		
		input = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\"description\":\"Created Via RestAssured\",\"short_description\":\"Created\"}");
		
		//send Request
		response = input.post();
		sys_id = response.jsonPath().get("result.sys_id");
		System.out.println("The Sys_Id is : "+sys_id);
		int statusCode = response.getStatusCode();
		
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		
		incNum = response.jsonPath().get("result.number");
		System.out.println("The incident Number is " +incNum);
		
		System.out.println("The Status Code is : "+statusCode);
		response.prettyPrint();
	}
}
