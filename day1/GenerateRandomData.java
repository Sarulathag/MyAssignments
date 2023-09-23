package week3.day1;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class GenerateRandomData
{

	@Test
	public void generateData()
	{
		
		Faker fake = new Faker();
		String firstName = fake.name().firstName();
	    System.out.println("FirstName : " + firstName);
	    String emailAddress = fake.internet().emailAddress();
	    System.out.println("Email Address : " + emailAddress);
	
		
	}
}
