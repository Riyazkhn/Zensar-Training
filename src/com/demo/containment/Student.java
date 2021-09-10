package com.demo.containment;

public class Student {
	int roll;
	String name;
	Department dt;
	public Student() {}
	

	public Student(int roll, String name, Department dt) {
		
		this.roll = roll;
		this.name = name;
		this.dt = dt;
	}

	public void setDt(Department d) {
		dt = d;
	}

	public Department getDt() {
		return dt;
	}

	public void setRoll(int r) {
		roll = r;
	}

	public int getRoll() {
		return roll;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
	void display()
	{
		System.out.println("Roll no is:" + getRoll());
		System.out.println("Name of student:" +getName());
		dt.display();
	}

}
