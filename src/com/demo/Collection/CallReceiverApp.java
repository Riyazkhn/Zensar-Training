package com.demo.Collection;

import java.util.ArrayList;
import java.util.List;
public class CallReceiverApp {
	ArrayList<String> l;
	ArrayList<String> l1;

	public CallReceiverApp() {

		l = new ArrayList<String>();
		// generic
		}

	public void makelist()
	{
		l.add("Mr X");
		l.add("Mr Y");
		l.add("AAAA");
		l.add("A");
		l.add("Mr X");
		l.add("Mr Y");
		l.add(2,"Mr.X");
	
		l1 = new ArrayList<String>();
		l1.add("BB");
		l1.add("AA");
		l1.addAll(1,l);// Duplication
		System.out.println(l); // order of insertion
		System.out.println(l1);
		l1.remove("AAAA");
		System.out.println(l1);
		System.out.println(l1.isEmpty());
        System.out.println(l1.contains("A"));
        
	}
	

	public static void main(String[] args) {
		CallReceiverApp c = new CallReceiverApp();
		c.makelist();
	  ArrayList<String > l1=new ArrayList<>();
	  ArrayList<String > l2 =new ArrayList<>();
	  l1.add("AAA");l1.add("BBB");l1.add("CCC");
	  l2.add("X");l2.add("Y");l2.add("Z");l2.add("BBB");
	  System.out.println(l1);
	  System.out.println(l2);
	  // l1.removeAll(l2);
	//  System.out.println(l1);
	//  l1.retainAll(l2);
	//  System.out.println(l1);
	 List<String> sl=l2.subList(1, 3);
	  System.out.println(sl);
	  for(int i=0;i<l1.size();i++)
	  {
		String str = l1.get(i);
		System.out.println(str);
	  }
	  for(String s:l1) {
		  System.out.println(s);
	  }
	}
}
