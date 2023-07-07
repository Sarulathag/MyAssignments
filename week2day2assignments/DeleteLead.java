package week2.week2day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("9");
		
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("71");
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("505103475");
		
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		Thread.sleep(3000);
		
		WebElement In = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String text = In.getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.findElement(By.linkText("Delete")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'id')]")).sendKeys(text);
		
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
