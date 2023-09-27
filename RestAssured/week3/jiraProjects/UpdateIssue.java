package jiraProjects;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class UpdateIssue extends BaseClass
{

	@Test(dependsOnMethods = "jiraProjects.CreateIssue.createJiraIssue")
	public void updateJiraIssue()
	{
		
		File fileName = new File("./src/test/resources/UpdateIssueJira.json");
		
		//AddRequest
		
		input = RestAssured.given()
		.contentType("application/json")
		.when()
		.body(fileName);
		
		//Send Request
		
		response = input.put("/"+issue_id);
		int statusCode = response.getStatusCode();
		response.then().assertThat().statusCode(Matchers.equalTo(204));
		
		System.out.println("The Issue Id is : " + issue_id);
		System.out.println("The Status Code is : "+statusCode);
		response.prettyPrint();
		
		
	}
}
