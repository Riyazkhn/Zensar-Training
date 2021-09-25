package com.demo.String;

import java.util.Arrays;
import java.util.Scanner;

public class WordString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1 = sc.nextLine();
		String word = "do";

		/*
		 * char ch[]=s1.toCharArray(); int count=0; for(char c:ch) { if(c=='?'||
		 * c==';'|| c=='!'||c==','||c==' ') count++; }
		 * System.out.println("count of Words: "+count);
		 */
		String a[] = s1.split(" ");
		int count = 0;
		for (String s : a) {
			if (s.compareTo(word) == 0) {
				count++;
			}
			System.out.println(s);

		}
		System.out.println("Occurences of word:" + count);
	}

}
