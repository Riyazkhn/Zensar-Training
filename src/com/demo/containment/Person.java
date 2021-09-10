package com.demo.containment;

public class Person {
	  String name,gender;
	  Address adr;
	  int age;
	  public void setAdr(Address adr)
	  {
		  this.adr=adr;
	  }
	  public Address getAdr() 
	  {
		  return adr;
		  
	  }
	  public void setName(String n)
	  {
		   name=n;
	  }
	  public String getName()
	  {
		  return name;
	  }
	  public void setGender(String g)
	  {
		   gender=g;
	  }
	  public String getGender()
	  {
		  return gender;
	  }
	  public void setAge(int a)
	  {
		   age=a;
	  }
	  public int getAge()
	  {
		  return age;
	  }
	public Person() {}
	public Person(String n, String g, Address add, int a) {
		
		name = n;
		gender = g;
		adr = add;
		age = a;
	}
	public void showDetails() {
	System.out.println(getAge());
	System.out.println(getGender());
	System.out.println(getName());
	adr.display();
	} 
	  

}
