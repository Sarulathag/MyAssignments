package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadsPage extends BaseClass
{
	public CreateLeadPage clickCreateLeadLink()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	public FindLeadPage clickFindLeadsLink()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage();
	}
	
	public MergeLeadPage clickMergeLeadLink()
	{
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage();
	}

}
