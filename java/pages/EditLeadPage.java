package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class EditLeadPage extends BaseClass
{
	public EditLeadPage clickEditButton()
	{
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}
	
	
	public EditLeadPage updateCompanyName()
	{
		WebElement updateElement = driver.findElement(By.id("updateLeadForm_companyName"));
		updateElement.clear();
		updateElement.sendKeys("CTS");
		return this;
		
	}
	
	
	public ViewLeadsPage clickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}

}
