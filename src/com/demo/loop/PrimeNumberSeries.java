package com.demo.loop;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		int count;
		System.out.println("Prime number from 400 to 300");
		for(int i=400;i>=300;i--)
		{
		  for(int j=1;j<=400;j++)
		  {
			  count =0;
			  if(i%j==0)
				  count++;
		  }
		//  if(count==2)
		  {
			  System.out.println("It is prime number"+i);
		  }
		//  else {
			  System.out.println("Not a prime number");
		  }
		  
		}

	}


