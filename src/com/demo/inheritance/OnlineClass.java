package com.demo.inheritance;

public class OnlineClass extends Exam {
	  int userId,outofmarks;
	  String Password;
	 public OnlineClass()
	  {
		   super();
		   System.out.println("This is child default construtor");
		    userId=101;
		   outofmarks=90;
		    Password="aosjaosa";
	  }
	public OnlineClass(int userId, int outofmarks, String password) {
		
		super("C++","Shardha");
		System.out.println("This is paramertised of child class");
		this.userId = userId;
		this.outofmarks =outofmarks;
		Password = password;
	}
	public void takeOnlineExam(int startime,int endtime)
	
	{
	
		System.out.println("Exam started:"+startime+"to"+endtime);
		
	}
	public void ShowResult(int markachieved) {
		
		markachieved=markachieved*100/outofmarks;
		System.out.println("Percentage Achived: "+markachieved);
	}
	public void fees(int s){                                 //overriding a method.
		System.out.println("Show fees of child:"+s);
	}
	 

}
