package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MergeLeadStepDefinition extends BaseClass
{
	public String leadID1;
	
	@And("Click MergeLeads Link")
	public void clickMergeLeadLink()
	{
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
	@And("Click From LeadImage Link")
	public void clickFromImageLink()
	{
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	
		
	@Given("Enter the FromFirstName as (.*)$")
	public void enterFromFirstName(String fname) throws InterruptedException
	{
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		leadID1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
	}
	
	@And("Click To LeadImage Link")
	public void clickToImageLink()
	{
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	
	@Given("Enther the toFirstName as (.*)$")
	public void enterToFirstName(String toname) throws InterruptedException
	{
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(toname);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
	}
	
	@And("Click the Merge Button and Handle the alert")
	public void clickMergeAndHandleAlert()
	{
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}
	
	@Given("Enter the mergeLeadID")
	public void entermergeLeadID()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID1);
	}
	
	@Then("Verify MergeLead page")
	public void verifyMergeLead()
	{
		String text3 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text3);
		if (text3.equals("No records to display"))
		{
			System.out.println("Text matched");
		} 
		else
		{
			System.out.println("Text not matched");
		}
	}

}
