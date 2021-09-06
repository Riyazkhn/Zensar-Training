package com.demo.conditional;

import java.util.*;

public class Alphabet {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character whether vowel or consonats");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("User enter is vowel");
		} else {
			System.out.println("User enter is consonats");
		}

	}

}
