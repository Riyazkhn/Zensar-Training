package com.demo.inheritance;

public class HourlyBased extends Teacher {
	int rate_per_hr,hrs;
	public HourlyBased() {
		super();
		System.out.println("This is default child construtor");
		int rate_per_hr=73;
		int hrs=20;
	}

	public HourlyBased(int r, int h) {
		System.out.println("This is parametrized child construtor");

		rate_per_hr = r;
		hrs = h;
	}

	void salary() {
		 int a=1000;
		 System.out.println("Salary of a person:"+a);

	}
	
	  

}
