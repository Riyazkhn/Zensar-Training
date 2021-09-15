package com.demo.Comparator;
import java.util.Comparator;
public class RollNoComparator implements Comparator<Student> {

@Override
	public int compare(Student r1, Student r2) {
		return r1.studentRollNo -r2.studentRollNo;
	
				}
	

}
