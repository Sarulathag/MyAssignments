package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLeadPage extends BaseClass
{
	public CreateLeadPage enterCompanyName()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		return this;
	}
	
	
	public CreateLeadPage enterFirstName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sarulatha");
		return this;
	}
	
	
	public CreateLeadPage enterLastName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		return this;
	}

	
	public CreateLeadPage enterPhoneNumber()
	{
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;
	}
	
	
	public ViewLeadsPage clickCreateLeadButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}

}
