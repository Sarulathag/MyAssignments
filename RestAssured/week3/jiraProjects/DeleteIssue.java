package jiraProjects;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class DeleteIssue extends BaseClass
{

	@Test(dependsOnMethods = "jiraProjects.UpdateIssue.updateJiraIssue")
	public void delete()
	{
				
		//send Request
		response = RestAssured.delete("/"+issue_id);
		int statusCode = response.getStatusCode();
		response.then().assertThat().statusCode(Matchers.equalTo(204));
		
		System.out.println("The Status Code is : "+statusCode);
		
	}
}
