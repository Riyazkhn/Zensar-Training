package com.demo.conditional;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether even or odd");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("User enter is even number");
		} else {
			System.out.println("User enter is odd number");
		}

	}

}
