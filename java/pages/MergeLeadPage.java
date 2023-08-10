package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MergeLeadPage extends BaseClass
{
	public FromNameWindow clickFromImageLink()
	{
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FromNameWindow();
	}

	public ToNameWindowPage clickToImageLink()
	{
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new ToNameWindowPage();
	}
	
	public MyLeadsPage clickMergeAndHandleAlert()
	{
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new MyLeadsPage();
	}
}
