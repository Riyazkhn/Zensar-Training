package com.demo.inheritance;

public class TeacherHourlySalaryMain {

	public static void main(String[] args) {

		HourlyBased h = new HourlyBased();
		h.salary();
		SalaryBased s=new SalaryBased(5000);
		s.salary();
		Teacher t=new HourlyBased();          //in context of HourlyBased object
		t.salary();
		Teacher ta=new SalaryBased(3000);      //in context of SalaryBased object;
		ta.salary();
		
	
		

	}

}
