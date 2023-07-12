package week3.week3Day2Assignment;

import java.util.*;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class RemoveDuplicates 
{

	public static void main(String[] args)
	{
		String str = "PayPal India";
		
		char[] ch = str.toCharArray();
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		for(int i =0; i<ch.length; i++)
		{
			if(!charSet.contains(ch[i]))
			{
				if(ch[i] == ' ')
				{
					dupCharSet.add(ch[i]);
					
				}
				else
				{
					charSet.add(ch[i]);
					
				}
			}
			else
			{
				dupCharSet.add(ch[i]);
								
			}
			if(!dupCharSet.contains(ch[i]))
			{
				charSet.add(ch[i]);
			}
			else
			{
				charSet.remove(ch[i]);
			}
						
		}
		
		System.out.println("Removed Duplicate List : " + charSet);
		System.out.println("Duplicate List : " + dupCharSet);
	}

}
