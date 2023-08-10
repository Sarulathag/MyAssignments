package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass
{

	@And("Click FindLeads Link")
	public void clickFindLeadsLink()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@And("Click Phone Link")
	public void clickPhoneLink()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Given("Enter the phonenumbers as (.*)$")
	public void enterPhoneNumbers(String phno)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	}
	
	@When("Click FindLeads Button")
	public void clickFindLeads()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@And("Click the FirstRecord")
	public void clickFirstRecord() throws InterruptedException
	{
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@And("Click the Edit Button")
	public void clickEditButton()
	{
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@And("Update the CompanyName as (.*)$")
	public void updateCompanyName(String cName1)
	{
		WebElement updateElement = driver.findElement(By.id("updateLeadForm_companyName"));
		updateElement.clear();
		updateElement.sendKeys(cName1);
		
	}
	
	@When("Click on Update Button")
	public void clickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("ViewLeadPage should be displayed as (.*)$")
	public void verifyUpdateLead(String cName1)
	{
		String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text1.contains(cName1)) 
		{
			System.out.println("Lead Updated successfully");
		}
		else
		{
			System.out.println("Lead is not Updated");
		}
		
	}
}
