package com.demo.containment;

public class Survey {
public static void main(String[] args) {
	Person p=new Person();
	p.setAge(18);
	p.setGender("Male");
	p.setName("Sohil");
	Address ad=new Address("MiraRoad","Maharastra","India");
	p.setAdr(ad);
	//System.out.println(p.getAge());
	//System.out.println(p.getGender());
	//System.out.println(p.getName());
	//Address ade=p.getAdr();
	//ade.display();
	p.showDetails();
	Person p1=new Person("Aman", "male", 
			new Address("Mira road", "pune", "india"),34);
	p1.showDetails();
	
}
}
