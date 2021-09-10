package com.demo.containment;

public class DepartmentStudentMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.setRoll(10);
		s.setName("Riyaz");
		Department d = new Department(1, "Aset");
		s.setDt(d);                                             //using setter and getter method
		System.out.println("Roll no is:" + s.getRoll());
		System.out.println("Name of student:" + s.getName());
		Department dt = s.getDt();
		dt.display();

		Student s1 =new Student(2,"Ram",new Department(121,"B-tech"));    //using Constructor 
		s1.display();
	}
}
