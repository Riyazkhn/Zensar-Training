package com.demo.loop;

import java.util.*;

public class OddSum {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the odd number from 1 to n");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}

		}
		System.out.println("Sum of all odd number: " + sum);
	}

}
