package week2.week2day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact 
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
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Sarulatha");
		
		driver.findElement(By.id("lastNameField")).sendKeys("G");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Saru");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("G");
		
		driver.findElement(By.name("departmentName")).sendKeys("Selenium Batch");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Creating Contact Form");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sarulatha1.g@gmail.com");
		
		WebElement stateDD = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select sec = new Select(stateDD);
		sec.selectByVisibleText("New York");

		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("It is Updated");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
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
