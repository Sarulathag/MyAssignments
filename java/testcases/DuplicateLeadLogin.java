package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DuplicateLeadLogin extends BaseClass
{
	@Test
	public void runLogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.enterUserName().enterPassword().clickLoginButton().verifyHomePage().clickCrmsfaLink().clickLeadsLink()
		.clickFindLeadsLink()
		.clickPhoneLink()
		.enterPhoneNumbers()
		.clickFindLeads()
		.clicktheFirstRecord()
		.clickDuplicateLead()
		.clickCreateLeadButton()
		.verifyDuplicateLeadPage();
		
	}

}