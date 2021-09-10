package com.demo.realworld;

public class MethodOverloading {
	double area;

	public void area(int radius) {
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle is:" + area);
	}

	public void area(float side) {
		area = side * side;
		System.out.println("Area of Square is: " + area);
	}

	public void area(int length, int width) {
		area = length * width;
		System.out.println("Area of rectangle is" + area);
	}

	public static void main(String[] args) {
		MethodOverloading a = new MethodOverloading();
		a.area(5);
		a.area(2.2f);
		a.area(5, 5);

	}

}
