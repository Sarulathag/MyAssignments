package week3.week3day1assignment;

public class Students 
{

	public void getStudentInfo(int id)
	{
		System.out.println("Student ID : " + id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Student ID : " + id);
		System.out.println("Student Name : " + name);
	}
	
	public void getStudentInfo(String email, long phoneno)
	{
		System.out.println("Student Email : " + email);
		System.out.println("Student Phone Number: " + phoneno);
	}
	public static void main(String[] args)
	{
		Students gsi = new Students();
		gsi.getStudentInfo(12345);
		gsi.getStudentInfo(12345,"Sarulatha");
		gsi.getStudentInfo("saru@gmail.com", 9873456780L);
		
		

	}

}
