package com.demo.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TwoDigitCollection {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(34);
		l.add(89);
		l.add(2);
		l.add(90);
		l.add(40);
		Iterator<Integer> itr = l.iterator();

		int count = 0;
		while (itr.hasNext()) {

			Integer num = itr.next();
			if (num >= 10 && num <= 99) {
				count++;
			}
		}
		System.out.println("Two Digit Number is : " + count);
		// System.out.println("Count of a number: "+twoDigitCount);

	}
}
