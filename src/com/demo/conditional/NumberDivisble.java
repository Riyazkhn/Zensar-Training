package com.demo.conditional;

import java.util.*;

public class NumberDivisble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println("Number is divisble by 5 and 11");
		} else {
			System.out.println("Number is not divisible by 5 and 11");
		}
	}
}
