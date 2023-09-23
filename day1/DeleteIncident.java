package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteIncident 
{

	@Test
	public void delete()
	{
		//Endpoint
		RestAssured.baseURI = "https://dev153437.service-now.com/api/now/table/incident";
				
		//Authentication
				
		RestAssured.authentication = RestAssured.basic("admin", "cw$v0%2bAQAR");
		
		//send Request
		Response response = RestAssured.delete("/4c82cbc047613110a0c35882e36d43c9");
		int statusCode = response.getStatusCode();
		System.out.println("My Status Code is : "+statusCode);
	}
}
