package week4.day1day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NykaaTask 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement eleBrand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(eleBrand).perform();
		
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("(//a[text()=\"L'Oreal Paris\"])[1]")).click();
		String text = driver.getTitle();
		System.out.println("The Title is : " +text);
		
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		WebElement filter = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]"));
		
		String text1 = filter.getText();
		
		WebElement filter1 = driver.findElement(By.xpath("(//span[@class='filter-value'])[2]"));
		
		String text2 = filter1.getText();
		
		
		
		if(text1.equals("Shampoo") && text2.equals("Color Protection"))
		{
			System.out.println("Filtered is applied to Shampoo and Color Protection");
		}
		else
		{
			System.out.println("Filtered is not applied");
		}
		
		WebElement picture = driver.findElement(By.xpath("//div[@class='css-xrzmfa']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",picture);
		
		String pWindowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listOfHandles = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listOfHandles.get(1));
		
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		
		WebElement mrpValue = driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]"));
		
		String price = mrpValue.getText();	
		
		System.out.println("MRP Price of the Shampoo is : " + price);
		
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		List<String> listOfHandles1 = new ArrayList<String>(windowHandles1);
		
		WebDriver window3 = driver.switchTo().window(listOfHandles1.get(1));
		String newWindow = window3.getTitle();
		System.out.println("Window3 Title: " + newWindow);
		
		driver.switchTo().frame(0);
		WebElement grandTotal = driver.findElement(By.xpath("(//div[1]/div/div/div[3]/div/div/div/div[1]/div/div[1]/span)[2]"));
		String total = grandTotal.getText();
		System.out.println("The Grand Total(including Shipping Charge) is : " + total);
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
		if(total.equals(price))
		{
			System.out.println("The Price of the product is same");
		}
		else
		{
			System.out.println("The Price of the product is different");
		}
		Thread.sleep(1000);
		driver.quit();
		
	}

}
