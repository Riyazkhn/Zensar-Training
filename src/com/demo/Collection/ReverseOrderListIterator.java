package com.demo.Collection;
import java.util.ArrayList;
import java.util.ListIterator;
public class ReverseOrderListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(5);
		num.add(8);
		num.add(3);
		num.add(7);
		num.add(2);
		System.out.println("Initial list: " + num);
		ListIterator<Integer> l = num.listIterator(num.size());
		System.out.println("Reverse of array list is: ");
		while (l.hasPrevious()) {
			System.out.println(l.previous());
		}

	}

}
