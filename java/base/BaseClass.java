package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	public static ChromeDriver driver;
	public static String leadID;
	public static String compName;
	public static String leadID1;
		
	@BeforeMethod
	public void preCondition()
	{
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void postCondtion()
	{
		driver.close();
	}

}
