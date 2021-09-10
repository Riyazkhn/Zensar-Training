package com.demo.array;
import java.util.*;
public class ArrayObjectEmployee {
	int empId;
	float salary;
	String eName;
	public ArrayObjectEmployee(int id,float s,String name) {
		empId=id;
		salary=s;
		eName =name;
		
	}
	public String toString()
	{
		return "\n id:"+empId+" Salary: "+salary+" ename: "+eName;
	}
	
	
public void Display() {
		System.out.println("id: "+empId);
		System.out.println("Salary: "+salary);
		System.out.println("enmae:"+eName);
	}


public static void main(String[] args) {
	  ArrayObjectEmployee[] e=new ArrayObjectEmployee[5];
	  Scanner sc =new Scanner(System.in);
	//  for(int i=0;i<e.length;i++)
	//  {
	//	   System.out.println(e[i]);             //initial array contain null value
	//  }
	//  e[0]=new ArrayObjectEmployee(1,2000.0f,"Ram");
	//  e[1]=new ArrayObjectEmployee(2,3000.f,"Shyam");
	//  e[2]=new ArrayObjectEmployee(3,1000.0f,"sohil");
	//  e[3]=new ArrayObjectEmployee(4,4000.0f,"aman");
	//  e[4]=new ArrayObjectEmployee(5,5000.0f,"Jam");
	    System.out.println("Enter employee details:");
	       for(int i=0;i<e.length;i++) {
		    int id =sc.nextInt();
		    float salary=sc.nextFloat();
		    String name=sc.next();
		   e[i]=new ArrayObjectEmployee(id, salary, name);
	  }
	  for(int i=0;i<e.length;i++)
	  {
		   e[i].Display();
	  }
	 for(ArrayObjectEmployee o:e)
	  {
		  System.out.println(o);
	  }
	 
}    
}

