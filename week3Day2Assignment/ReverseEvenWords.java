package week3.week3Day2Assignment;

public class ReverseEvenWords 
{

	public static void main(String[] args) 
	{
		String test = "I am a software tester"; 
		String[] t = test.split(" ");
		
		for (int i=0; i<t.length; i++)
		{
			if(i % 2!= 0)
			{
				char[] charArray = t[i].toCharArray();
				
				for(int j = charArray.length-1; j >=0; j--)
				{
					System.out.print(charArray[j]);
				}
			}
			else
			{
				System.out.print(" " + t[i] + " ");
			}
		}
		
				
	}

}
