package chaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class UpdateIncident extends BaseClass
{

	@Test(dependsOnMethods = "chaining.CreateIncident.create")
	public void update()
	{
		
		//AddRequest
		
		input = RestAssured.given()
		.contentType("application/json")
		.when()
		.body("{\"short_description\":\"Updated from RestAssured\"}");
		
		//Send Request
		
		response = input.put("/"+sys_id);
		int statusCode = response.getStatusCode();
		System.out.println("The Status Code is : "+statusCode);
		response.prettyPrint();
		
		response.then().assertThat().statusCode(Matchers.equalTo(200));
	}
}
