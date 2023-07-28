package week5.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIncident extends IncidentBaseClass
{

	@Test
	public void deleteIncidentCase() throws InterruptedException 
	{
			
		WebElement numberDropDown = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select numberDD = new Select(numberDropDown);
		numberDD.selectByVisibleText("Number");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010013",Keys.ENTER);
		
		
		WebElement table = driver.findElement(By.xpath("//table[@id='incident_table']"));
		table.findElement(By.linkText("INC0010013")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		driver.findElement(By.id("ok_button")).click();
		
		
		Thread.sleep(2000);
		
		
		WebElement numberDropDown1 = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select numberDD1 = new Select(numberDropDown1);
		numberDD1.selectByVisibleText("Number");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("INC0010013",Keys.ENTER);
		
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text2);
		
		if(text2.equals("No records to display"))
		{
			System.out.println("Record is deleted");
		}
		else
		{
			System.out.println("Record is not deleted");
		}
		
		driver.switchTo().defaultContent();
		
		
	}

}
