package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateNewIncident extends IncidentBaseClass
{
	@Test
	public void createNewIncidentCase() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//button[text()='New']")).click();
		String text = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("Incident Number: "+ text);
		
		driver.findElement(By.id("incident.short_description")).sendKeys("Created Via Automation");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.switchTo().defaultContent();
		
		WebElement eleFrame1 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame1);
		
		WebElement numberDropDown = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select numberDD = new Select(numberDropDown);
		numberDD.selectByVisibleText("Number");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(text,Keys.ENTER);
		driver.switchTo().defaultContent();
		
		WebElement eleFrame2 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame2);
		
		Thread.sleep(6000);
		
		String text1 = driver.findElement(By.xpath("//a[text()='Number']/following::a[@class='linked formlink']")).getText();
		
		if(text.equals(text1))
		{
			System.out.println("The Verified Incident is " + text1 + "and both matches");
		}
		else
		{
			System.out.println("The Incident is not matching");
		}
		
		driver.switchTo().defaultContent();
		
				
	}

}
