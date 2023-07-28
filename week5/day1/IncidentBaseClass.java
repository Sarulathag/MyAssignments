package week5.day1;

import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import io.github.sukgu.Shadow;

public class IncidentBaseClass
{
	public ChromeDriver driver;
	public Shadow shadow;
	public Shadow shadow1;
	
  
	@BeforeMethod
	public void preCondition()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");		
		driver = new ChromeDriver(options);
		driver.get("https://dev157895.service-now.com/welcome.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Selenium@23");
		driver.findElement(By.id("sysverb_login")).click();
		
		
		shadow = new Shadow(driver);
		shadow.setImplicitWait(40);
		shadow.findElementByXPath("//div[text()='All']").click();
				
		shadow.findElementByXPath("//span[text()='Incidents']").click();
		
		WebElement eleFrame = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(eleFrame);
	  
	}

	@AfterMethod
	public void postCondition()
	{
		shadow1 = new Shadow(driver);
		shadow1.setImplicitWait(30);
		shadow1.findElementByXPath("//span[@class='now-avatar-content']").click();
		shadow1.findElementByXPath("//button[@data-id = 'logout']").click();
		
		driver.close();
	}

}
