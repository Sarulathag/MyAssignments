package chaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass 
{

	public static String sys_id;
	public RequestSpecification input;
	public static Response response;
	public static String incNum;
	
	@BeforeMethod
	public void setup()
	{
		//Endpoint
		RestAssured.baseURI = "https://dev153437.service-now.com/api/now/table/incident";
						
		//Authentication
				
		RestAssured.authentication = RestAssured.basic("admin", "cw$v0%2bAQAR");
				
	}
}
