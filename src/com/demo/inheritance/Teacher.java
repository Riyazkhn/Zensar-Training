package com.demo.inheritance;

public abstract class Teacher {
	int Tid;
	String Tname, MobileNo;

	public Teacher() {
		System.out.println("This is Parent Default construtor");
		Tid=1;
		Tname="Meena";
		MobileNo="0454485034";
				
	}

	public Teacher(int tid, String tname, String mobileNo) {

		Tid = tid;
		Tname = tname;
		MobileNo = mobileNo;
	}
	abstract void salary();


}
