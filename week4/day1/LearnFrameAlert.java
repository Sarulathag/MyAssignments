package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameAlert 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		String text = simpleAlert.getText();
		System.out.println("Alert Message : " + text);
		
		Thread.sleep(3000);
		
		
		simpleAlert.accept();
		
		String text2 = driver.findElement(By.id("demo")).getText();
		if(text2.contains("OK"))
		{
			System.out.println("Alert Accepted");
		}
		
	}

}
