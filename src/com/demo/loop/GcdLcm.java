package com.demo.loop;

import java.util.*;

public class GcdLcm {

	public static void main(String[] args) {
		int gcd = 1, lcm = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number one");
		int num1 = sc.nextInt();
		System.out.println("Enter the number two ");
		int num2 = sc.nextInt();
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}

			lcm = num1 * num2 / gcd;

		}
		System.out.println("Greatest common divisior is:" + gcd);
		System.out.println("Lcm of the number is:" + lcm);

	}

}
