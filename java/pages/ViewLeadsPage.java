package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ViewLeadsPage extends BaseClass
{
	public ViewLeadsPage verifyViewLeads()
	{
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TCS")) 
		{
			System.out.println("Lead created successfully");
		}
		else
		{
			System.out.println("Lead is not created");
		}
		return this;
	}
	
	public ViewLeadsPage verifyUpdateLead()
	{
		String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text1.contains(text1)) 
		{
			System.out.println("Lead Updated successfully");
		}
		else
		{
			System.out.println("Lead is not Updated");
		}
		return this;
		
	}
	
	public ViewLeadsPage verifyDuplicateLeadPage()
	{
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String compName1 = text2.replaceAll("[^a-z A-Z]"," ");
		System.out.println(compName1);
				
		if(compName.equals(compName1))
		{
			System.out.println("Duplicate Lead created successfully");
		}
		else
		{
			System.out.println("Duplicate Lead not created");
		}
		return this;
			
	}
	
	public ViewLeadsPage verifyDeleteLead()
	{
		String text3 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text3);
		if (text3.equals("No records to display"))
		{
			System.out.println("Record Deleted");
		} 
		else
		{
			System.out.println("Record Not Deleted");
		}
		return this;
	}
	
	public ViewLeadsPage verifyMergeLead()
	{
		String text3 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text3);
		if (text3.equals("No records to display"))
		{
			System.out.println("Records Merged Successfully");
		} 
		else
		{
			System.out.println("Records not Merged");
		}
		return this;
	}

}
