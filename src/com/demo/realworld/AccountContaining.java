package com.demo.realworld;

public class AccountContaining {

	int balance;
	String accname,accountno;

	public void insert(int b, String acno, String name) {

		balance = b;
		accountno = acno;
		accname = name;

	}

	public void display() {

		System.out.println("Account no is: " + accountno);
		System.out.println("Balance in account: " + balance);
		System.out.println("Account holder name: " + accname);

	}

	public void deposit(int d) {

		balance = balance + d;
		System.out.println("After Deposting balance is : " + balance);
	}

	public void withdraw(int w) {
        if(balance>w)
        {
		balance = balance - w;
		System.out.println("After withdraw  balance is:" + balance);
        }
        else
        {
        	System.out.println("Balance is insufficient!.... ");
        }
	}

	public void check_balance() {
		System.out.println(" Balance in bank : " + balance);
	}

}
