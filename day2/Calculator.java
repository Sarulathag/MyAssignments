package week1.day2;

public class Calculator 
{
	public int addThreeNumbers(int a, int b, int c)
	{
		int d = a + b + c;
		return d;
	}
	public float subTwoNumbers(int a, float b)
	{
		float c = a - b;
		return c;
	}
	public int divideTwoNumbers(int a, int b)
	{
		int c = a/b;
		return c;
	}
	public static void main(String[] args)
	{
		Calculator cl = new Calculator();
		
		int add = cl.addThreeNumbers(15,55,6);
		System.out.println("Addition of Three Number is : " + add);
		
		float sub = cl.subTwoNumbers(55,35.5f);
		System.out.println("Subtraction of Two Number is : " + sub);
		
		int div = cl.divideTwoNumbers(68,4);
		System.out.println("Division of Two Number is : " + div);
	}	
}
