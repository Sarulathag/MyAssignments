package week2.week2day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonChecking 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		
		System.out.println("The title is : " + driver.getTitle());
		
		driver.get("https://www.leafground.com/button.xhtml");
		
		WebElement disbutton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		boolean editable = disbutton.isEnabled();
				
		System.out.println("Is button enabled or disabled : " + editable);
		
		if(editable)
		{
			System.out.println("It is Enabled");
		}
		else
		{
			System.out.println("It is Disabled");
		}
		
		System.out.println("The Location is : " + driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[1]")).getLocation());
		
		System.out.println("The Color is : " + driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color"));
		
		System.out.println("The Height is : " + driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]")).getSize().getHeight());
		
		System.out.println("The Width is : " + driver.findElement(By.xpath("(//span[contains(text(),'Submit')])[2]")).getSize().getWidth());
		
		driver.findElement(By.xpath("//span[contains(text(),'Image')]")).click();
		
		
	}

}
