package com.demo.String;

public class ReverseOfString {
	public static void main(String[] args) {
		String s1 = "Java Programming";
		char ch[] = s1.toCharArray();
		String reverse = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse += ch[i];

		}

		System.out.println(reverse);
	}

}
