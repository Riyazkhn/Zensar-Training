package com.demo.String;

public class Teach {

	int id;
	String name;

	Teach() {
	}

	public Teach(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Id is" + id + "Name is:" + name;

	}
}