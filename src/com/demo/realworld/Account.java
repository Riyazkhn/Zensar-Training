package com.demo.realworld;

public class Account {
	long Accountno;
	String Customername;

	Account() {
		Accountno = 40238432L;
		Customername = "sohil";
		System.out.println("I am a default construtor:");
		System.out.println("Accountno is:" + Accountno);
		System.out.println("Customer name:" + Customername);

	}

	Account(long accno, String name) {
		Accountno = accno;
		Customername = name;
		System.out.println("I am Parmaterised constructor");
		System.out.println("Accountno is:" + Accountno);
		System.out.println("Customer name:" + Customername);
	}

}
