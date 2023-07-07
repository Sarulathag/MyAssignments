package week2.week2day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead 
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
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("(//input [@name='emailAddress'])[1]")).sendKeys("sarulatha1.g@gmail.com");
		
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		Thread.sleep(3000);
		
		WebElement In = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
		String text = In.getText();
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		System.out.println("The title is : " + driver.getTitle());
		
		if(driver.getTitle().contains("Duplicate Lead"))
		{
			System.out.println("The page has the title name as Duplicate Lead");
		}
		else
		{
			System.out.println("The page does not have the title name as Duplicate Lead");
		}
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		Thread.sleep(3000);
		
		WebElement DupLead = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String name = DupLead.getText();
					
		if(text.equals(name))
		{
			System.out.println("Both the names are same");
		}
		else
		{
			System.out.println("Both are different");
		}
		
		driver.close();

	}

}
