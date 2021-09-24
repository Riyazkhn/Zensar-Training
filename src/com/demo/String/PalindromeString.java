package com.demo.String;

import java.util.Scanner;

public class PalindromeString {
	public static boolean checker(String s1) {
		char ch[] = s1.toCharArray();
		for (int i = 0, j = ch.length - 1; i < j; i++, j--) {
			if (ch[i] != ch[j])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		checker(s1);
		if (checker(s1)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}
}