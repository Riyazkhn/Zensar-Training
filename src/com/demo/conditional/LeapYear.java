package com.demo.conditional;

import java.util.*;

public class LeapYear {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year which u want to found wheather leap year or not");
		int years = sc.nextInt();
		if ((years % 4 == 0 && years % 400 == 0) || (years % 100 != 0)) {
			System.out.println("Year is leap year");
		} else {
			System.out.println("Year is not leap year");
		}
	}

}
