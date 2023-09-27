package chaining;

import java.util.List;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class GetIncidentWithQueryParam extends BaseClass
{

	@Test(dependsOnMethods = "chaining.CreateIncident.create")
	public void getIncident()
	{
		
		
		//Add a single Query Parameter
		input = RestAssured.given();
		
		//Send Request
		response = input.get();
		List<Object> sysidList = response.jsonPath().getList("result.sys_id");
		System.out.println("Total Number of Incidents : " + sysidList.size());
		
		response.then().assertThat().body("result.number", Matchers.hasItem(incNum));
	    System.out.println("The Incident Number is ----"+incNum);

		
	}
}
