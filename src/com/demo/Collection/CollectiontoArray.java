package com.demo.Collection;
import java.util.ArrayList;
public class CollectiontoArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(43);
		list.add(20);
		System.out.println("Intial List: "+list);
		Integer[] array = new Integer[list.size()];
		list.toArray(array);
		for(Integer n:array)
		{
			System.out.println(n);
		}
		// System.out.println("Elements in list" + list);
		// Object[] obj=list.toArray();
		// for(Object o:obj)
		// {
		// Integer s =(Integer) o;
		// System.out.println(s);
	}

}
