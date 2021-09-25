package com.demo.String;

public class ChangeCharacterCase {
	public static void main(String[] args) {
		String s1 = "ZenSar";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) (ch[i] - 32);
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}

		}
		System.out.println("Lower to upper case:");
		System.out.println(ch);

	}
}