package org.system;

public class Desktop extends Computer
{

	public void desktopSize()
	{
		System.out.println("The Size of the Desktop is 20 inch");
	}
	
	public void desktopModel()
	{
		System.out.println("The Desktop Model is Apple Pro");
	}
	
	public static void main(String[] args)
	{
		Desktop dp = new Desktop();
		dp.computerModel();
		dp.desktopModel();
		dp.desktopSize();
	}
}
