package week3.day2;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncidentWithAssertion 
{

	@Test
	public void delete()
	{
		//Endpoint
		RestAssured.baseURI = "https://dev153437.service-now.com/api/now/table/incident";
				
		//Authentication
				
		RestAssured.authentication = RestAssured.basic("admin", "cw$v0%2bAQAR");
		
		//send Request
		Response response = RestAssured.delete("/a9ce7f5c47a57110a0c35882e36d4301");
		int statusCode = response.getStatusCode();
		System.out.println("My Status Code is : "+statusCode);
		
		response.then().assertThat().statusCode(Matchers.equalTo(200));
	}
}
