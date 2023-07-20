package week4.day1day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabs 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()=\"Open Multiple\"]")).click();
		String parentTitle = driver.getTitle();
		System.out.println("Parent Title : " + parentTitle);
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window Handle : " + parentWindowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println("The Number of Opened Tabs are : " + size);
		
		System.out.println("Window Handles: " + windowHandles);
		
		
		List<String> listofHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(listofHandles.get(1));
		
		String childTitle = driver.getTitle();
		System.out.println("Child Window Title Name: " + childTitle);
		
		Thread.sleep(3000);
		for(String eachHandle : windowHandles )
		{
			if(!eachHandle.equals(parentWindowHandle))
			{
				driver.switchTo().window(eachHandle).close();
			}
		}
		
		driver.switchTo().window(parentWindowHandle);
		driver.close();

	}

}
