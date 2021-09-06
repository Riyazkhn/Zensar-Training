package com.demo.loop;

import java.util.*;

public class CountDigit {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which u want to count in digit: ");
		int n = sc.nextInt();
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println("Count of digits:" + count);

	}

}
