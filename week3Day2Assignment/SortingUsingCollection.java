package week3.week3Day2Assignment;

import java.util.*;

public class SortingUsingCollection 
{

	public static void main(String[] args)
	{
		String[] str = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		int len = str.length;
		
		System.out.println("Actual List : " + Arrays.toString(str));
		
		List<String> allString = new ArrayList<String>();
		
		for(int i = 0 ; i<len ; i++)
		{
			allString.add(str[i]);
		}
		
		Collections.sort(allString);
		
		System.out.println("Sorted List : " + allString);
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(int j = allString.size()-1; j>=0; j--)
		{
			set.add(allString.get(j));
		}
		System.out.println("Reversed List : " + set);
		

	}

}
