package com.demo.loop;

public class EvenLoop {

	public static void main(String[] args) {
		System.out.println("Printing even number from 121 to 229...!");
		for (int i = 121; i <= 229; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number: " + i);
			}
		}

	}

}
