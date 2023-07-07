package week2.week2day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBAccountCreation 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Sarulatha");
		
		driver.findElement(By.name("lastname")).sendKeys("G");
		
		driver.findElement(By.name("reg_email__")).sendKeys("0505103475");
		
		driver.findElement(By.id("password_step_input")).sendKeys("abc123");
		
		WebElement sourceDD = driver.findElement(By.id("day"));
		Select sec = new Select(sourceDD);
		sec.selectByVisibleText("9");
		
		WebElement sourceDD1 = driver.findElement(By.id("month"));
		Select sec1 = new Select(sourceDD1);
		sec1.selectByIndex(3);
		
		WebElement sourceDD2 = driver.findElement(By.id("year"));
		Select sec2 = new Select(sourceDD2);
		sec2.selectByValue("1983");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		

	}

}
