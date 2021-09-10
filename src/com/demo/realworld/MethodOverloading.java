package com.demo.realworld;

public class MethodOverloading {
	double area;

	public void Area(int radius) {
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle is:" + area);
	}

	public void Area(float side) {
		area = side * side;
		System.out.println("Area of Square is: " + area);
	}

	public void Area(int length, int width) {
		area = length * width;
		System.out.println("Area of rectangle is" + area);
	}

	public static void main(String[] args) {
		MethodOverloading a = new MethodOverloading();
		a.Area(5);
		a.Area(2.2f);
		a.Area(5, 5);

	}

}
