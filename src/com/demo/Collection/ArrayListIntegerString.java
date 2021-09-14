package com.demo.Collection;
import java.util.ArrayList;
public class ArrayListIntegerString {
	ArrayList l;
	ArrayList<String> l1;
	ArrayList<Integer> l2;

	public ArrayListIntegerString() {
		l = new ArrayList();
		l1 = new ArrayList<>();
		l2 = new ArrayList<>();

	}

	public void makelist() {
		l.add("Mr X");
		l.add("Mr.Y");
		l.add(5);
		l.add(10);
		l.add("Mr Z");
		l.add(30);
		System.out.println(l);
		for (Object o : l) {
			if (o instanceof String) {
				l1.add((String) o);
			} else if (o instanceof Integer) {
				l2.add((Integer) o);
			}
		}
		System.out.println("List l1" + ": " + l1);
		System.out.println("List l2:" + l2);

	}

	public static void main(String[] args) {
		ArrayListIntegerString s = new ArrayListIntegerString();
		s.makelist();

	}
}
