package week1.day2;

import java.util.Arrays;

public class FindSecondLargest 
{

	public static void main(String[] args)
	{
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int len = data.length;
		System.out.println("Sorted Array List is : " + Arrays.toString(data));
		int seclarge = data[len-2];
		System.out.println("Second Largest Value is : " + seclarge);
	}

}
