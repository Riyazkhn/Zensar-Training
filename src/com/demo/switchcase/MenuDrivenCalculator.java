package com.demo.switchcase;

import java.util.*;

public class MenuDrivenCalculator {

	public static void main(String[] args) {
		int result;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter the operation u want to perform:");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			result = num1 + num2;
			System.out.println("Addtion of two  number:" + result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("Subtraction  of two number:" + result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("Multiplication  of two number:" + result);
			break;
		case 4:
			result = num1 / num2;
			System.out.println("Division of two number:" + result);
			break;
		default:
			System.out.println("Invalid input");

		}

	}

}
