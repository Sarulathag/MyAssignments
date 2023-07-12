package week3.week3Day2Assignment;

public class ChangeOddIndexToUpperCase 
{

	public static void main(String[] args) 
	{
		String test = "changeme";
		char[] ch = test.toCharArray();
		
		for(int i = 0; i<ch.length;i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(Character.toLowerCase(ch[i]));
			}
			else
			{
				System.out.print(Character.toUpperCase(ch[i]));
			}
		}

	}

}
