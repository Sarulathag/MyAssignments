package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class DeleteLeadPage extends BaseClass
{
	public MyLeadsPage clickDeleteButton()
	{
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage();
	}
	
	
	

}
