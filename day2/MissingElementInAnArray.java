package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray 
{

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,7,6,8};
		int count = 0;
		Arrays.sort(arr);
		System.out.println("Sorted Array List is : " + Arrays.toString(arr));
		
		for(int i = 0 ; i <= arr.length; i++)
		{
			count = i + 1;
			if(count!=arr[i])
			{
				System.out.println("Missing Number is : " + count);
				break;
			}
		}
	}

}
