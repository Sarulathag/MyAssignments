package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DuplicateLeadStepDefinition extends BaseClass
{
	@And("Click the DuplicateLead Button")
	public void clickDuplicateLead()
	{
		String coName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    compName = coName.replaceAll("[^a-z A-Z]"," ");
		System.out.println(compName);
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	
	@Then("ViewDuplicateLeadPage should be displayed")
	public void verifyLeadPage()
	{
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String compName1 = text2.replaceAll("[^a-z A-Z]"," ");
		System.out.println(compName1);
		
		if(compName.equals(compName1))
		{
			System.out.println("Duplicate Lead created successfully");
		}
		else
		{
			System.out.println("Duplicate Lead not created");
		}
			
	}

}
