package com.demo.containment;

public class mydate {
	String day, month, year;

	public mydate(String day, String month, String year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	void display() {
		System.out.println("Day is: " + day);
		System.out.println("Month is:" + month);
		System.out.println("Year is:" + year);
	}

}
