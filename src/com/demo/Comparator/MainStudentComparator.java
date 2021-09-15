package com.demo.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class MainStudentComparator {
	public static void main(String[] args) {
		ArrayList<Student> s =new ArrayList<>();
		s.add(new Student(102, 34, "Aman"));
		s.add(new Student(101, 35, "Sohil"));
		s.add(new Student(104,38,"Adil"));
		s.add(new Student(103, 18, "Yash"));
		System.out.println("Original List");
		for(Student stud:s)
		{
			System.out.println(stud);
		}
		System.out.println("Sorting using Rollno using Comparator!..");
		Collections.sort(s,new RollNoComparator());
		for(Student stud:s)
		{
			System.out.println(stud);
		}
		System.out.println("Sorting using name using Comparator!.. ");
		Collections.sort(s,new NameComparator());
		for(Student stud:s)
		{
			System.out.println(stud);
		}
		System.out.println("Sorting using Age using Comparator!.. ");
		Collections.sort(s,new AgeComparator());
		for(Student stud:s)
		{
			System.out.println(stud);
		}
		
		
	}
	

}
