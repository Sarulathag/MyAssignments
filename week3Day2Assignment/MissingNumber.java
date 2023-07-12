package week3.week3Day2Assignment;

import java.util.*;


public class MissingNumber 
{

	public static void main(String[] args)
	{
		int[] arr = {8,1,2,3,4,7,6,9,10,2,4,7,9,1,8};
		int count = 0; 
		
		Set<Integer> unique = new TreeSet<Integer>();
				
		for (int i = 0; i<arr.length; i++)
		{
			unique.add(arr[i]);
									
		}
		System.out.println("Sorted values from Treeset : " + unique);
		
		List<Integer> missing = new ArrayList<Integer>(unique);
		int len = missing.size();

		for(int j = 0 ; j <= len; j++)
		{
			count = j + 1;
			if(count!=missing.get(j))
			{
				System.out.println("Missing Number is : " + count);
				break;
			}
		}
		
		
	}

}
