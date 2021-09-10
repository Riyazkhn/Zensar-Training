package com.demo.containment;

public class EmployeeDeptMydateMain {
	public static void main(String[] args) {
		Employee e =new Employee();
		e.setId(1);
		e.setName("Shayam");
		e.setSalary(5000);
		dept d=new dept(101,"Aset");
		e.setT(d);
		mydate m =new mydate("Sunday","July","Leap");
		e.setMyd(null);
		System.out.println("Employee id:"+e.getId());                                          //by using getter and setter
		System.out.println("Employee salary: "+e.getSalary());
		System.out.println("Employee name: "+e.getName());
	      dept t =e.getT();
		  t.display();
		  mydate ma =e.getMyd();
		  m.display();
		  
		  Employee e1 =new Employee(12, 3000, "Javed",new dept(103,"B.com"),new mydate("Monday","March", "non leap year") );
		  e1.display();
		
	}
	
	

}
