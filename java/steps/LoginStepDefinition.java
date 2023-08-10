package steps;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition extends BaseClass
{
	
//	public String leadID;
//	public String compName;
	
//	@Given("Open Chrome browser")
//	public void openBrowser()
//	{
//		driver = new ChromeDriver();
//	}
//	
//	@And("Load the url")
//	public void loadUrl()
//	{
//		driver.get("http://leaftaps.com/opentaps/control/login");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
	
	@Given("Enter the username as {string}")
	public void enterUserName(String uName)
	{
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@And("Enter the password as {string}")
	public void enterPassword(String pword)
	{
		driver.findElement(By.id("password")).sendKeys(pword);
	}
	
	@When("Click on the Login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("HomePage should be displayed")
	public void verifyHomePage()
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
	}
	
//	@But("ErrorMessage should be displayed")
//	public void verifyErrorMessage()
//	{
//		String text = driver.findElement(By.id("errorDiv")).getText();
//		if(text.contains("Errors"))
//		{
//			System.out.println("Error Message is Verified");
//		}
//	}
	
//	@When("Click on crmsfaLink")
//	public void clickCrmsfaLink()
//	{
//		driver.findElement(By.linkText("CRM/SFA")).click();
//	}
//	
//	@And("Click Leads Button")
//	public void clickLeadsLink()
//	{
//		driver.findElement(By.linkText("Leads")).click();
//	}
//	
//	@And("Click CreateLead Link")
//	public void clickCreateLeadLink()
//	{
//		driver.findElement(By.linkText("Create Lead")).click();
//	}
//	
//		
//	@Given("Enter the Companyname as (.*)$")
//	public void enterCompanyName(String cName)
//	{
//		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
//	}
//	
//	@And("Enter the firstname as (.*)$")
//	public void enterFirstName(String fName)
//	{
//		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
//	}
//	
//	@And("Enter the lastname as (.*)$")
//	public void enterLastName(String lName)
//	{
//		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
//	}
//
//	@And("Enter the phonenumber as (.*)$")
//	public void enterPhoneNumber(String pno)
//	{
//		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pno);
//	}
//	
//	@When("Click on CreateLead Button")
//	public void clickCreateLeadButton()
//	{
//		driver.findElement(By.name("submitButton")).click();
//	}
//	
//	@Then("ViewLeadsPage should be displayed as (.*)$")
//	public void verifyViewLeads(String cName)
//	{
//		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
//		if (text.contains(cName)) 
//		{
//			System.out.println("Lead created successfully");
//		}
//		else
//		{
//			System.out.println("Lead is not created");
//		}
//	}
//	@And("Close the browser")
//	public void closeBrowser()
//	{
//		driver.close();
//	}
//	
//	@And("Click FindLeads Link")
//	public void clickFindLeadsLink()
//	{
//		driver.findElement(By.linkText("Find Leads")).click();
//	}
//	
//	@And("Click Phone Link")
//	public void clickPhoneLink()
//	{
//		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//	}
//	
//	@Given("Enter the phonenumbers as (.*)$")
//	public void enterPhoneNumbers(String phno)
//	{
//		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
//	}
//	
//	@When("Click FindLeads Button")
//	public void clickFindLeads()
//	{
//		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//	}
//	
//	@And("Click the FirstRecord")
//	public void clickFirstRecord() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
//		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
//	}
//	
//	@And("Click the Edit Button")
//	public void clickEditButton()
//	{
//		driver.findElement(By.linkText("Edit")).click();
//	}
//	
//	@And("Update the CompanyName as (.*)$")
//	public void updateCompanyName(String cName1)
//	{
//		WebElement updateElement = driver.findElement(By.id("updateLeadForm_companyName"));
//		updateElement.clear();
//		updateElement.sendKeys(cName1);
//		
//	}
//	
//	@When("Click on Update Button")
//	public void clickUpdateButton()
//	{
//		driver.findElement(By.name("submitButton")).click();
//	}
//	
//	@Then("ViewLeadPage should be displayed as (.*)$")
//	public void verifyUpdateLead(String cName1)
//	{
//		String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
//		if (text1.contains(cName1)) 
//		{
//			System.out.println("Lead Updated successfully");
//		}
//		else
//		{
//			System.out.println("Lead is not Updated");
//		}
//		
//	}
	
//	@And("Click the Delete Button")
//	public void clickDeleteButton()
//	{
//		driver.findElement(By.linkText("Delete")).click();
//	}
//	
//	@Given("Enter the LeadID")
//	public void enterLeadID()
//	{
//		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
//	}
//	
//	@Then("Verify DeleteLead page")
//	public void verifyDeleteLead()
//	{
//		String text3 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
//		System.out.println(text3);
//		if (text3.equals("No records to display"))
//		{
//			System.out.println("Text matched");
//		} 
//		else
//		{
//			System.out.println("Text not matched");
//		}
//	}
	
//	@And("Click the DuplicateLead Button")
//	public void clickDuplicateLead()
//	{
//		String coName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
//	    compName = coName.replaceAll("[^a-z A-Z]"," ");
//		System.out.println(compName);
//		driver.findElement(By.linkText("Duplicate Lead")).click();
//	}
//	
//	@Then("ViewDuplicateLeadPage should be displayed")
//	public void verifyLeadPage()
//	{
//		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
//		String compName1 = text2.replaceAll("[^a-z A-Z]"," ");
//		System.out.println(compName1);
//		
//		if(compName.equals(compName1))
//		{
//			System.out.println("Duplicate Lead created successfully");
//		}
//		else
//		{
//			System.out.println("Duplicate Lead not created");
//		}
//			
//	}
}
