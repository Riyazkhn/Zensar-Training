package com.demo.Collection;
import java.util.ArrayList;
import java.util.Collections;
public class ReplaceElement {
	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<>();
		n.add(5);
		n.add(10);
		n.add(15);
		n.add(20);
		n.add(3);
		System.out.println("Elements in array list:" + n);
		n.set(2, 78);
		System.out.println("After Replacing:" + n);
	}
}
