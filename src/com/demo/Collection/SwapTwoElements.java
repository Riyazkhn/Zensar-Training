package com.demo.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElements {
	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<>();
		s.add(5);
		s.add(10);
		System.out.println("Before swap arraylist..!" + s);
		Collections.swap(s, 0, 1);
		System.out.println("After Swapping" + s);

	}

}
