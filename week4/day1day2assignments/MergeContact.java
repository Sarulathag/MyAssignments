package week4.day1day2assignments;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("(//table[contains(@class,'twoColumnForm')]//td[2]/a)[1]")).click();
		
		String pWindowHandle = driver.getWindowHandle();
		
		Set<String> fromWindow = driver.getWindowHandles();
		
		List<String> fromList = new ArrayList<String>(fromWindow);
		
		driver.switchTo().window(fromList.get(1));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.switchTo().window(pWindowHandle);
		
		driver.findElement(By.xpath("(//table[contains(@class,'twoColumnForm')]//td[2]/a)[2]")).click();
		
		Set<String> toWindow = driver.getWindowHandles();
		
		List<String> toList = new ArrayList<String>(toWindow);
		
		driver.switchTo().window(toList.get(1));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
		driver.switchTo().window(pWindowHandle);
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String text = simpleAlert.getText();
		System.out.println("Alert Message : "+ text);
		simpleAlert.accept();
		

	}

}
