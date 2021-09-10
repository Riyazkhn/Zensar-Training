package com.demo.containment;

public class Department {
	int id;
	String name;

	public Department(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("Id is:" + id);
		System.out.println("name is: " + name);
	}

}
