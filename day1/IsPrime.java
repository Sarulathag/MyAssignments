package week1.day1;

public class IsPrime 
{

	public static void main(String[] args) 
	{
		int i, n = 7,f =0;
	
		if(n==0||n==1)
		{
			System.out.println(n + " is not Prime Number");
		}
		else
		{
			for(i=2;i<=n-1;i++)
			{
				if(n%i==0)
				{
					System.out.println(n + " is not Prime Number");
					f = 1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(n + " is Prime Number");
			}
		}
		

	}

}
