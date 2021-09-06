package com.demo.loop;

import java.util.*;

public class EvenSum {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the even number for 1 to n:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum of even number" + sum);

	}

}
