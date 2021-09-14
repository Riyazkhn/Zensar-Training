package com.demo.Collection;
import java.util.ArrayList;
public class ArrayListFunction {
	ArrayList<Integer> l;

	ArrayListFunction() {
		l = new ArrayList();
	}

	public void makelist() {
		l.add(45);
		l.add(35);
		l.add(90);
		l.add(20);
		l.add(50);
		System.out.println("Intiallist: " + l);

	}

	public void displayFor() {
		System.out.println("Using Forloop!");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}

	public void displayForEach() {
		System.out.println("Using ForEach!...");
		for (Integer n : l) {
			System.out.println(n);
		}
	}

	public void addAll() {
		System.out.println("AddAll method");
		System.out.println("Intial list" + l);
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(7);
		l1.add(23);
		l1.addAll(l);
		System.out.println("After adding elements" + l1);
	}

	public void removeAll() {
		System.out.println("Remove all list elements");
		l.removeAll(l);
		System.out.println(l);
	}

	public void remove(int i) {
		System.out.println("Remove elements is particular location:");
		l.remove(i);
		System.out.println(l);
	}

	public void removeobject(int obj) {
		System.out.println("Remove object");
		l.remove(new Integer(obj));
		System.out.println(l);
	}

	public void retainAll() {
		System.out.println("Retain Elemetns:");
		ArrayList<Integer> r = new ArrayList<>();
		r.add(35);
		r.add(90);
		r.retainAll(l);
		System.out.println(r);
	}

	public static void main(String[] args) {
		ArrayListFunction o = new ArrayListFunction();
		o.makelist();
		o.displayFor();
		o.displayForEach();
		o.addAll();
		o.remove(2);
		o.retainAll();
		o.removeobject(45);
		o.removeAll();
	}
}
