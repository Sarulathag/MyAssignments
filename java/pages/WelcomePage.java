package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class WelcomePage extends BaseClass
{
	public WelcomePage verifyHomePage()
	{
		String title = driver.getTitle();
		if(title.contains("Leaftaps"))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Login not Successfull");
		}
		return this;
	}
	public MyHomePage clickCrmsfaLink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
