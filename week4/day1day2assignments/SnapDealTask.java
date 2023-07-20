package week4.day1day2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDealTask 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement eleBrand = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(eleBrand).perform();
		
		driver.findElement(By.xpath("(//span[text()=\"Sports Shoes\"])[1]")).click();
		WebElement count = driver.findElement(By.xpath("//*[@id=\"js-46105686-nav\"]/li/a/div[2]"));
		String shoeCount = count.getText();
		System.out.println("Count of the Sports Shoes are : " + shoeCount);
		
		driver.findElement(By.xpath("//div[text()=\"Training Shoes\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//i[@class=\"sd-icon sd-icon-expand-arrow sort-arrow\"]")).click();
		
		driver.findElement(By.xpath("//li[@data-sorttype=\"plth\"]")).click();
		
		WebElement fromValue = driver.findElement(By.xpath("//input[@name=\"fromVal\"]"));
		
		fromValue.clear();
		fromValue.sendKeys("500");
		
		
		WebElement toValue = driver.findElement(By.xpath("//input[@name=\"toVal\"]"));
		toValue.clear();
		toValue.sendKeys("900");
		
		driver.findElement(By.xpath("//div[@class=\"price-go-arrow btn btn-line btn-theme-secondary\"]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[4]/div[3]/div/div[4]/label")).click();
		
		WebElement priceElement = driver.findElement(By.xpath("(//div[@class=\"navFiltersPill\"]/a)[1]"));
		String price1 = priceElement.getText();
		
		WebElement colorElement = driver.findElement(By.xpath("(//div[text()=\"Color: \"]/a)[1]"));
		String color = colorElement.getText();
		
		if(price1.equals("Rs. 519 - Rs. 899") && color.equals("Navy"))
		{
			System.out.println("Filter is applied to Price and Color");
		}
		else
		{
			System.out.println("Filter is not applied");
		}
		WebElement shoeImage = driver.findElement(By.xpath("//img[@class=\"product-image wooble\"]"));
		
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(shoeImage).perform();
		
		driver.findElement(By.xpath("//div[@class=\"clearfix row-disc\"]/div")).click();
		
		WebElement shoePrice = driver.findElement(By.xpath("//div[@class=\"product-price pdp-e-i-PAY-l clearfix\"]/span[1]"));
		String price2 = shoePrice.getText();
		
		System.out.println("Price of the Shoe: " + price2);
		
		WebElement percentage = driver.findElement(By.xpath("//div[@class=\"product-price pdp-e-i-PAY-l clearfix\"]/span[2]"));
		String percent = percentage.getText();
		
		System.out.println("Percentage off : " + percent);
		
		WebElement scrollEle = driver.findElement(By.xpath("//div[@class=\"sidebarin-content\"]"));
		Actions act = new Actions(driver);
		act.scrollToElement(scrollEle).perform();
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snapdeal.png");
		FileUtils.copyFile(source, dest);
		
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
