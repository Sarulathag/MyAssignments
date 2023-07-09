package week3.week3day1assignment;

public class Samsung extends AndroidTV
{
	@Override
	public void watchVideo() 
	{
		System.out.println("Watch the YouTube Video from Concrete Class Samsung");		
	}
	
	public void playVideo() 
	{
		System.out.println("Play the Video from Concrete Class Samsung");
		
	}
	
	public void concreteMethod()
	{
		System.out.println("This is Samsung Class own method");
	}
	
	public static void main(String[] args) 
	{
		Samsung sg = new Samsung();
		sg.openApp();
		sg.watchVideo();
		sg.playVideo();
		sg.concreteMethod();

	}

	

}
