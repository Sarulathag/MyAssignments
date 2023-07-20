package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt Dialog')]/following::span[1]")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		
		String text = promptAlert.getText();
		System.out.println("Alert Message : " + text);
		Thread.sleep(3000);
		
		promptAlert.sendKeys("Sarulatha");
		
		
		promptAlert.accept();
		
		String text2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println("Confirmed Message : " + text2);
		
		if(text2.contains("Sarulatha"))
		{
			System.out.println("Message Accepted");
		}
		
		
	}

}
