package chaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class DeleteIncident extends BaseClass
{

	@Test(dependsOnMethods = "chaining.UpdateIncident.update")
	public void delete()
	{
				
		//send Request
		response = RestAssured.delete("/"+sys_id);
		int statusCode = response.getStatusCode();
		System.out.println("My Status Code is : "+statusCode);
		response.then().assertThat().statusCode(Matchers.equalTo(204));
	}
}
