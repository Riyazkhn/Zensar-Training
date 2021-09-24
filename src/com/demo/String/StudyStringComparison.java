package com.demo.String;

public class StudyStringComparison {
	public static void main(String[] args) {
		Teach t =new Teach(1,"Shardh");
		Teach t1 =new Teach(1,"Shardh");
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t==t1);
		System.out.println(t.equals(t1));
	     String s1 ="hello";
		 String s2 ="hello";
		  String s3="hii";
		  if(s1==s3)
		  {
			  System.out.println("S1 ans S2 are same");
		  }
		  else {
			  System.out.println("s1 and S2 are not same");
		  }
		 if(s1.equals(s3))
		 {
			 System.out.println("S1 ans S2 are same");
		 }
		 else {
			 System.out.println("S1 and S2 are not same");
		 }
		// Teach t= new Teach(1,"Arun");
		// Teach t1= new Teach(1,"Arun");
	    // System.out.println(t);
	   //  System.out.println(t1);
	    
	} 
}


       

