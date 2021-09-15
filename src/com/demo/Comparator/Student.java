package com.demo.Comparator;
public class Student{
	int studentRollNo, age;
	String name;
    public Student() {
		}
	public Student(int studentRollNo, int age, String name) {
		this.studentRollNo = studentRollNo;
		this.age = age;
		this.name = name;
	
	}
	@Override
	public String toString() {
		return "studentRollNo=" + studentRollNo + ", age=" + age + ", name=" + name + "";
	}
      
}