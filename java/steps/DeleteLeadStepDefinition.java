package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteLeadStepDefinition extends BaseClass
{
	@And("Click the Delete Button")
	public void clickDeleteButton()
	{
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@Given("Enter the LeadID")
	public void enterLeadID()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	
	@Then("Verify DeleteLead page")
	public void verifyDeleteLead()
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
