package com.demo.conditional;

import java.util.*;

public class LargestNumbers {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		if (a > b && b > c) {
			System.out.println("a number is greater" + a);
		} else if (b > a && b > c) {
			System.out.println("b number is greater: " + b);
		} else {
			System.out.println("c is greater: " + c);
		}
	}

}
