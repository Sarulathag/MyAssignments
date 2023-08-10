package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class MergeLeadLogin extends BaseClass
{
	@Test
	public void runLogin() throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.enterUserName().enterPassword().clickLoginButton().verifyHomePage().clickCrmsfaLink().clickLeadsLink()
		.clickMergeLeadLink()
		.clickFromImageLink()
		.enterFromFirstName()
		.clickToImageLink()
		.enterToFirstName()
		.clickMergeAndHandleAlert()
		.clickFindLeadsLink()
		.enterMergeLeadID()
		.clicktheFindLeads()
		.verifyMergeLead();
	}

}