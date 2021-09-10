package com.demo.realworld;

public class Employee {
	private int id,salary;
	private String name;
	
	public void setid(int id)
	{
		 this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setsalary(int salary)
	{
		 this.salary=salary;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setid(String name)
	{
		 this.name=name;
	}
	public String  getName()
	{
		return name;
	}
	public static void main(String[] args) {
		Employee o =new Employee();
		o.setid(5);
		o.setsalary(5000);
		o.setid("Sohil");
		System.out.println(o.getid());
		System.out.println(o.getSalary());
		System.out.println(o.getName());
	}
}
