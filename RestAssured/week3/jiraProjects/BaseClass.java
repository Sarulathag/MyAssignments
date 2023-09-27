package jiraProjects;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass 
{

	public static String issue_id;
	public RequestSpecification input;
	public static Response response;
	//public static String incNum;
	
	@BeforeMethod
	public void setup()
	{
		//Endpoint
		RestAssured.baseURI = "https://sarulathajira.atlassian.net/rest/api/2/issue/";
						
		//Authentication
				
		RestAssured.authentication = RestAssured.preemptive().basic("sarulatha1.g@gmail.com", "ATATT3xFfGF0iXtTNCXFYdIXgMahITp7sPquRHj4MgYSVAJEeE4z72BxlMB5ElDcOheluGqpU0587pvJhf-nOZ5rwmjMpdEhZV6MwYi9aH06ljuL15YoXAjmg9zdq8ZZBs4DeKksgQZKLNiMOjHly2O5P0iiu-LEx8RanMDvpwCLnx8Hl-KaXI8=859B9931");
				
	}
}
