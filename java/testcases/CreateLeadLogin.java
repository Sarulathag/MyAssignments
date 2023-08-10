package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLeadLogin extends BaseClass
{
	@Test
	public void runLogin()
	{
		LoginPage lp = new LoginPage();
		lp.enterUserName().enterPassword().clickLoginButton().verifyHomePage().clickCrmsfaLink().clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enterPhoneNumber()
		.clickCreateLeadButton()
		.verifyViewLeads();
		
	}

}
