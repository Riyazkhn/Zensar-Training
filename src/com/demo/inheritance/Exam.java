package com.demo.inheritance;

public class Exam {
	  String University_name;
	  private String ExamType;
	  Exam(){
		  System.out.println("This is parent default construtor");
		  ExamType="JAVA";
		  University_name="Amity University";
	  }
	public Exam(String examType, String university_name) {
		System.out.println("This is parameterized constructor of parent class");
		ExamType = examType;
		University_name = university_name;
	}
	protected void examDetails(){
		System.out.println("ExamType: "+ExamType);
		System.out.println("University:"+University_name);
	}
	public void fees(int x){
		System.out.println("Show fees:"+x);
	}
	  
	  

}
