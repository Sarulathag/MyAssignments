package week2.week2day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACMELoginPage
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		System.out.println("The title is : " + driver.getTitle());
		
		if(driver.getTitle().contains("ACME System 1 - Dashboard"))
		{
			System.out.println("The page has the title name as ACME System 1 - Dashboard");
		}
		else
		{
			System.out.println("The page does not have the title name as ACME System 1 - Dashboard");
		}
		
		//driver.findElement(By.className("navbar-toggle")).click();
		
		driver.findElement(By.linkText("Log Out")).click();
		
		driver.close();
		

	}

}
