package week3.week3Day2Assignment;

import java.util.*;


import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RemoveDuplicateWords 
{

	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");
		
		
		Set<String> unique = new LinkedHashSet<String>();
		
		for(int i = 0; i<split.length; i++)
		{
			unique.add(split[i]);
		}
		
				
		System.out.println("The Text is : " + unique);

	}

}
