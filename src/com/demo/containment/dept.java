package com.demo.containment;

public class dept {
	int dept_id;
	String dept_name;

	public dept() {
	}

	public dept(int dept_id, String dept_name) {

		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	void display() {
		System.out.println("dept_id is: " + dept_id);
		System.out.println("dept_name is:" + dept_name);
	}

}
