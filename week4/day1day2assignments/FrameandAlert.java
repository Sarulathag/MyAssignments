package week4.day1day2assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameandAlert 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("dummy-chat-button-iframe");
		driver.findElement(By.id("dummy-chat-button")).click();
		driver.switchTo().frame("ShopifyChat");
		driver.findElement(By.xpath("//div[@class='composer-bar__box']/textarea")).sendKeys("Hai");
		driver.findElement(By.xpath("//button[contains(@class,'chat-app')]")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//div[@class='product-content']//a")).click();
		driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("638183");
		
		
		WebElement eleMen = driver.findElement(By.xpath("//input[@type='button'][@value='Check']"));
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",eleMen);
		
		
		driver.findElement(By.xpath("//button[@id='product-add-to-cart']")).click();
		Thread.sleep(1000);
		
		WebElement viewElement = driver.findElement(By.xpath("//a[text() = 'View Cart']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",viewElement);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		
		
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		String text = simpleAlert.getText();
		System.out.println("Alert Message : "+ text);
		simpleAlert.accept();
		
	}

}
