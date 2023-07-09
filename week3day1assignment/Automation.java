package week3.week3day1assignment;

public class Automation extends MultipleLanguage implements TestTool
{

	public void java() 
	{
		System.out.println("Java Method ---> called from Language Interface");
		
	}

	public void selenium()
	{
		System.out.println("Selenium Method ---> Called from TestTool Interface");
		
	}

	@Override
	public void python() 
	{
		System.out.println("Python Method ---> Called from Multiple Language Abstract Class");
		
	}

	@Override
	public void ruby()
	{
		System.out.println("Ruby Method ---> Called from Multiple Language Abstract Class");
		
	}
	
	public static void main(String[] args)
	{
		Automation at = new Automation();
		at.java();
		at.selenium();
		at.python();
		at.ruby();
	}

}
