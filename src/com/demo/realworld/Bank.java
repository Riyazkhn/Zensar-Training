package com.demo.realworld;

public class Bank {

	public static void main(String[] args) {
		AccountContaining ac = new AccountContaining();
		ac.insert(1000, "13928475489357", "Aman");
		ac.display();
		ac.check_balance();
		ac.deposit(500);
		ac.check_balance();
		ac.withdraw(200);
		ac.check_balance();

	}

}
