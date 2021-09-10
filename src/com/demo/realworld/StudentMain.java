package com.demo.realworld;

public class StudentMain {
	public static void main(String[] args) {
		Student s =new Student();
		s.setCourseid("Java");
		System.out.println(s.getCourseid());
		s.doDefault(18);
		s.doProtected(577767);
		s.doPublic(12);
	}

}
