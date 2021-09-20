package com.demo.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

class Employee implements Comparable<Employee> {
	int id;
	String name;

	public Employee() {

	}

	public int compareTo(Employee o) {
		return o.id - this.id;

	}

	public Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + "";
	}

	
	  public int hashCode() { final int result; result = id + name.hashCode();
	  return result; }
	  
	  public boolean equals(Object o) {
		  if (o == null) return false; 
		  if (this == o) return true; 
		  if (this.getClass() != o.getClass()) return false; 
		  Employee eo =(Employee) o; 
		  if (this.id == eo.id && this.name.equals(eo.name)) 
			  return true;
	  else return false;
	  
	  }
	 

}

public class CustomHashMap {
	public static void main(String[] args) {

		HashMap<Employee, String> s = new HashMap<>();

		/*
		 * Employee e = new Employee(1, "Riyaz"); System.out.println(e.hashCode());
		 * Employee e1 = new Employee(1, "Riyaz"); System.out.println(e1.hashCode());
		 */
		s.put(new Employee(1, "Riyaz"), "Worker");
		s.put(new Employee(2, "Aman"), "Supervisior");
		s.put(new Employee(3, "Sajid"), "Assistant");
		s.put(new Employee(1, "Riyaz"), "Sr.Engineer");
		s.put(new Employee(5, "Sohil"), "Jr.engineer");
		Set<Employee> e2 = s.keySet();
		Iterator<Employee> itr = e2.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			String str = s.get(emp);
			System.out.println("key is:" + emp + " Value is " + str);

		}

		/*
		 * LinkedHashMap<Integer, String> l = new LinkedHashMap<>(12, 0.70f, true);
		 * l.put(1, "Hello"); l.put(2, "Bye"); l.put(3, "Sleeep");
		 * System.out.println(l); l.get(2); System.out.println(l);
		 */

		/*
		 * TreeMap<Integer, String> t = new TreeMap<>(); t.put(2, "good"); t.put(1,
		 * "morning"); System.out.println(t);
		 */

		TreeMap<Employee, String> t = new TreeMap<>();
		t.put(new Employee(1, "Riyaz"), "Worker");
		t.put(new Employee(2, "Aman"), "Supervisior");
		t.put(new Employee(3, "Sajid"), "Assistant");
	    t.put(new Employee(5, "Sohil"), "Jr.engineer");
		System.out.println("******After sorting*******");
		Set<Employee> k = t.keySet();
		Iterator<Employee> it = k.iterator();
		while (it.hasNext()) {
			Employee em = it.next();
			String str = t.get(em);
			System.out.println("Key is:" + em + " Value is: " + str);
		}

	}

}
