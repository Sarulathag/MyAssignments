package jiraProjects;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class CreateIssue extends BaseClass
{

	@Test
	public void createJiraIssue()
	{
		
		File fileName = new File("./src/test/resources/CreateIssueJira.json");
		//AddRequest
		
		input = RestAssured.given()
		.contentType("application/json")
		.when()
		.body(fileName);
		
		//send Request
		response = input.post();
		
		issue_id = response.jsonPath().get("id");
		
		
		
		int statusCode = response.getStatusCode();
		
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		
		System.out.println("The Jira Issue ID is : "+issue_id);
		
		System.out.println("The Status Code is : "+statusCode);
		
		response.prettyPrint();
	}
}
