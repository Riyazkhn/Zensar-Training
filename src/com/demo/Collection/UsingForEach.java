package com.demo.Collection;

import java.util.ArrayList;

public class UsingForEach {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println("Using for each...!");
		for (Integer o : list) {
			System.out.println(o);
		}
	}

}
