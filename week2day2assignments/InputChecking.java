package week2.week2day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputChecking 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("j_idt88:name")).sendKeys("Sarulatha");
		
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("  India");
		
		System.out.println(driver.findElement(By.id("j_idt88:j_idt93")).isEnabled());
		
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		
		WebElement In = driver.findElement(By.id("j_idt88:j_idt97"));
		String text = In.getAttribute("value");
		
		System.out.println(text);
		
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("sarulatha1.g@gmail.com");
		
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am Learning Selenium");
		
		

	}

}
