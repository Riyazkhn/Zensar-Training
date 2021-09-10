package com.demo.containment;

public class Employee {
	int id, salary;
	String name;
	dept t;
	mydate myd;

	public Employee() {
	}

	public Employee(int id, int salary, String name, dept t, mydate myd) {

		this.id = id;
		this.salary = salary;
		this.name = name;
		this.t = t;
		this.myd = myd;
	}

	public void setId(int i) {
		id = i;
	}

	public int getId() {
		return id;
	}

	public void setSalary(int s) {
		salary = s;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public void setT(dept dt) {
		t = dt;
	}

	public dept getT() {
		return t;
	}

	public void setMyd(mydate m) {
		myd = m;
	}

	public mydate getMyd() {
		return myd;
	}

	public void display() {
		System.out.println("Employee id:" + getId());
		System.out.println("Employee salary: " + getSalary());
		System.out.println("Employee name: " + getName());
		t.display();
		myd.display();

	}

}
