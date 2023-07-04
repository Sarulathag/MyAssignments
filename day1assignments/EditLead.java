package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sarulatha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saru");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Project for Practice");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sarulatha1.g@gmail.com");
		
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select sec = new Select(stateDD);
		sec.selectByVisibleText("New York");
				
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("It is Updated");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("The title is : " + driver.getTitle());
		
		if(driver.getTitle().contains("View Lead"))
		{
			System.out.println("The page has the title name as View Lead");
		}
		else
		{
			System.out.println("The page does not have the title name as View Lead");
		}
		

	}

}
