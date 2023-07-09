package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Student Name : Sarulatha");
	}
	
	public void studentDept()
	{
		System.out.println("Student Department : Computer Science");
	}
	
	public void studentID()
	{
		System.out.println("Student ID : SID12");
	}
	
	public static void main(String[] args)
	{
		Student st = new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.departmentName();
		st.departmentID();
		st.studentName();
		st.studentID();
		st.studentDept();
				
	}
}
