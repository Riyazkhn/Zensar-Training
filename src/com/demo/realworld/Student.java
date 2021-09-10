package com.demo.realworld;

public class Student {
	public long rollno;
	protected int addmissionNo;
	int age;
	private String courseid;
	public void doPublic(int r)
	{
		  rollno=r;
		  System.out.println("Roll no: "+r);
	}
	void doDefault(int a)
	{
		age=a;
		System.out.println("Age is: "+age);
	}
	protected void doProtected(int a)
	{
		addmissionNo=a;
		System.out.println("Admission number is:"+addmissionNo);
	}
	public void  setCourseid(String c)
	{
		courseid=c;
	}
	public String getCourseid()
	{
		return courseid;
	}
	
}
  

