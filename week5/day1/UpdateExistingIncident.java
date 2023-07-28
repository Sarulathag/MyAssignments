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

public class UpdateExistingIncident extends IncidentBaseClass
{

	@Test
	public void updateExistingIncidentCase() 
	{
		
				
		WebElement numberDropDown = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select numberDD = new Select(numberDropDown);
		numberDD.selectByVisibleText("Number");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010012",Keys.ENTER);
		
		
		WebElement table = driver.findElement(By.xpath("//table[@id='incident_table']"));
		table.findElement(By.linkText("INC0010012")).click();
		
		
		WebElement urgency = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
		Select urgencyRisk = new Select(urgency);
		urgencyRisk.selectByVisibleText("1 - High");
		
		
		WebElement state = driver.findElement(By.xpath("//select[@id='incident.state']"));
		Select stateAs = new Select(state);
		stateAs.selectByVisibleText("In Progress");
		String status = stateAs.toString();
		System.out.println(status);
		
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		driver.switchTo().defaultContent();
		
		WebElement eleFrame2 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame2);
		
		WebElement table1 = driver.findElement(By.xpath("//table[@id='incident_table']"));
		table1.findElement(By.linkText("INC0010012")).click();
		
		String stateLevel = driver.findElement(By.xpath("//span[text()='In Progress']")).getText();
		System.out.println("The Verified State is : " + stateLevel);
		
		if(status.equals(stateLevel))
		{
			System.out.println("The value is updated");
		}
		else
		{
			System.out.println("The Value is not updated");
		}
		driver.switchTo().defaultContent();
		
				
	}

}
