package com.demo.Collection;

import java.util.ArrayList;

public class UsingForLoop {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println("Using For loop");
		for (int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println(n);
		}
	}

}
