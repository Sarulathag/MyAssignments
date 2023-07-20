package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop 
{

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
			
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement source = driver.findElement(By.xpath("//p[contains(text(),'Drag to target')]"));
		WebElement target = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();

	}

}
