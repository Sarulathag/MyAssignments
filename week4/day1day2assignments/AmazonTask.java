package week4.day1day2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonTask 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro ");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement firstPrice = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]"));
		String price = firstPrice.getText();
		String replacedString = price.replaceAll(",","");
		
		int price1 = Integer.parseInt(replacedString);
		System.out.println("Price of the first Phone: " + price1);
		
		WebElement eleMen = driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative']/i[1]"));
		eleMen.click();
		
		WebElement ratings = driver.findElement(By.xpath("(//div[@class=\"a-icon-row a-spacing-small a-padding-none\"]//span)[2]"));
		String customerRatings = ratings.getText();
		System.out.println("Customer Ratings : " + customerRatings);
		
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(list.get(1));
		
		WebElement scrollEle = driver.findElement(By.xpath("//div[@id=\"centerCol\"]"));
		Actions act = new Actions(driver);
		act.scrollToElement(scrollEle).perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/amazon.png");
		FileUtils.copyFile(source, dest);
		
		
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
		Thread.sleep(3000);             
		
		WebElement subTotal = driver.findElement(By.xpath("//div[@class=\"a-column a-span11 a-text-left a-spacing-top-large\"]/span[2]/span"));
		String cartTotal = subTotal.getText();
		String replacedString1 = cartTotal.replaceAll("[^0-9]","");
		
		String cartValue = replacedString1.substring(0, replacedString1.length() - 2);
		
		System.out.println("Cart SubTotal : " + cartValue);
		
				
		int cartTotal1 = Integer.parseInt(cartValue);
		
		if(price1 == cartTotal1)
		{
			System.out.println("Cart SubTotal is equal to actual Price");
		}
		else
		{
			System.out.println("Price is not equal");
		}
		Thread.sleep(3000);
		for(String eachHandle : windowHandles )
		{
			if(!eachHandle.equals(parentWindow))
			{
				driver.switchTo().window(eachHandle).close();
			}
		}
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
		driver.close();
	}

}
