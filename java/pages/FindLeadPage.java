package pages;

import org.openqa.selenium.By;
import base.BaseClass;

public class FindLeadPage extends BaseClass
{

	public FindLeadPage enterLeadID()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	
	public FindLeadPage enterMergeLeadID()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID1);
		return this;
	}
	
	public FindLeadPage clickPhoneLink()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	
	public FindLeadPage enterPhoneNumbers()
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		return this;
	}
	
	
	public FindLeadPage clickFindLeads()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return this;
	}
	
	
	public EditLeadPage clickFirstRecord() throws InterruptedException
	{
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new EditLeadPage();
	}
	
	public DuplicateLeadPage clicktheFirstRecord() throws InterruptedException
	{
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new DuplicateLeadPage();
	}
	
	public DeleteLeadPage clickRecord() throws InterruptedException
	{
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new DeleteLeadPage();
	}
	
	public ViewLeadsPage clicktheFindLeads()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		return new ViewLeadsPage();
	}
	
}
