package com.demo.Comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student a1, Student a2) {
		return a1.age-a2.age;
	}

}
