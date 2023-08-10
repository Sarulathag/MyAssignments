package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class DuplicateLeadPage extends BaseClass
{
	
	public CreateLeadPage clickDuplicateLead()
	{
		String coName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    compName = coName.replaceAll("[^a-z A-Z]"," ");
		System.out.println(compName);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new CreateLeadPage();
	}
	
	
}
