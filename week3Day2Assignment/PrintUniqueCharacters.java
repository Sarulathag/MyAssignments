package week3.week3Day2Assignment;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacters 
{

	public static void main(String[] args) 
	{
		String str = "babu";
		char[] ch = str.toCharArray();
		
		Set<Character> unique = new LinkedHashSet<Character>();
		
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
						
		for (int i = 0; i<ch.length; i++)
		{
			if(!unique.contains(ch[i]))
			{
				unique.add(ch[i]);
			}
			else
			{
				dupCharSet.add(ch[i]);
				
			}
			if(!dupCharSet.contains(ch[i]))
			{
				unique.add(ch[i]);
			}
			else
			{
				unique.remove(ch[i]);
			}
												
		}
		
		System.out.println("Unique values from Treeset : " + unique);

	}

}
