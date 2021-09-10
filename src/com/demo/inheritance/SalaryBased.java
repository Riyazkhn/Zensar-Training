package com.demo.inheritance;

public class SalaryBased extends Teacher {
	int salary;
	

	public SalaryBased(int salary) {

		this.salary = salary;
	}

	void salary() {
		System.out.println("Salary is:" +salary);
	}

}
