package com.demo.Collection;
import java.util.ArrayList;
public class ArrayListZeroandOnepPostion {
	ArrayList l;

	public ArrayListZeroandOnepPostion() {
		l = new ArrayList<>();
	}

	public void makeList() {
		l.add(45);
		l.add("Mr X");
		for (Object o : l) {
			System.out.println(o);
		}

	}

	public static void main(String[] args) {
		ArrayListZeroandOnepPostion o = new ArrayListZeroandOnepPostion();
		o.makeList();
	}

}
