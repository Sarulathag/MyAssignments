package week2.week2day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectChecking 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement sourceDD = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select sec = new Select(sourceDD);
		sec.selectByIndex(1);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement sourceDD1 = driver.findElement(By.xpath("//option[@value='India']']"));
		Select sec1 = new Select(sourceDD1);
		sec1.selectByVisibleText("India");
		
		WebElement sourceDD2 = driver.findElement(By.xpath("//select[@id='j_idt87:city_input']"));
		Select sec2 = new Select(sourceDD2);
		sec2.selectByValue("Chennai");
		
		WebElement sourceDD3 = driver.findElement(By.xpath("//select[@id='j_idt87:lang_input']"));
		Select sec3 = new Select(sourceDD3);
		sec3.selectByIndex(2);
		
		WebElement sourceDD4 = driver.findElement(By.xpath("//select[@id='j_idt87:value_input']"));
		Select sec4 = new Select(sourceDD4);
		sec4.selectByValue("Two");

	}

}
