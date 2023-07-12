package week3.week3Day2Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest 
{

	public static void main(String[] args)
	{
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		int seclar;
		
		Set<Integer> secLarge = new TreeSet<Integer>();
		
		for(int i = 0; i<data.length; i++)
		{
			secLarge.add(data[i]);
			
		}
		
		System.out.println("Sorted values from Treeset : " + secLarge);
		
		List<Integer> second = new ArrayList<Integer>(secLarge);
		int len = second.size();
		
		System.out.println("Size of the List : " +len);
		
		seclar = second.get(len-2);
		
		System.out.println("Values from List : " + second);
		System.out.println("Second Largest Number is : " + seclar);
		
		
	}

}
