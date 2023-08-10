package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepsDefinition extends BaseClass
{
	@When("Click on crmsfaLink")
	public void clickCrmsfaLink()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@And("Click Leads Button")
	public void clickLeadsLink()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@And("Click CreateLead Link")
	public void clickCreateLeadLink()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
		
	@Given("Enter the Companyname as (.*)$")
	public void enterCompanyName(String cName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}
	
	@And("Enter the firstname as (.*)$")
	public void enterFirstName(String fName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}
	
	@And("Enter the lastname as (.*)$")
	public void enterLastName(String lName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@And("Enter the phonenumber as (.*)$")
	public void enterPhoneNumber(String pno)
	{
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pno);
	}
	
	@When("Click on CreateLead Button")
	public void clickCreateLeadButton()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("ViewLeadsPage should be displayed as (.*)$")
	public void verifyViewLeads(String cName)
	{
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) 
		{
			System.out.println("Lead created successfully");
		}
		else
		{
			System.out.println("Lead is not created");
		}
	}

}
