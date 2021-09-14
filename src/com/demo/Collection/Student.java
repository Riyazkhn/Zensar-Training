package com.demo.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Student {
	int rollNo;
	String Name;
	String City;

	public Student() {

	}

	public Student(int rollNo, String name, String city) {

		this.rollNo = rollNo;
		Name = name;
		City = city;
	}

	public String toString() {
		return "Student rollno:" + rollNo + " Student name :" + Name + " Student city:" + City;
	}

	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<>();
		s.add(new Student(1, "riyaz", "Pune"));
		s.add(new Student(2, "Aman", "Mumbai"));
		s.add(new Student(3, "Sohil", "Agra"));
		s.add(new Student(4, "Sajid", "Delhi"));
		s.add(new Student(5, "Akhil", "Mumbai"));
		System.out.println("Using For loop....");
		for (int i = 0; i < s.size(); i++) // using for loop
		{

			System.out.println(s.get(i));
		}
		System.out.println("Using Enhanced ForLoop");
		for (Student o : s) {
			System.out.println(o);
		}
		System.out.println("By using iterator");
		Iterator<Student> itr = s.iterator();
		while (itr.hasNext()) {
			Student stud = itr.next();
			System.out.println(stud);
		}

	}
}
