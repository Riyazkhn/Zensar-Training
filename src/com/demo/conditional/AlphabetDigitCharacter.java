package com.demo.conditional;

import java.util.*;

public class AlphabetDigitCharacter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit, special character,alphabet: ");
		char ch = sc.next().charAt(0);
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
			System.out.println("User Enter is Alphabet: " + ch);
		} else if (ch >= 48 && ch <= 56) {
			System.out.println("User enter is Digit:" + ch);
		} else {
			System.out.println("User enter is special character: " + ch);
		}

	}

}
