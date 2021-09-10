package com.demo.containment;

public class Address {
	String city, state, country;

	public Address() {
	}

	public Address(String city, String state, String country) {

		this.city = city;
		this.state = state;
		this.country = country;
	}

	public void display() {
		System.out.println("City: " + city);
		System.out.println("State:" + state);
		System.out.println("Country:" + country);
	}

}
