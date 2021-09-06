package com.demo.switchcase;

import java.util.*;

public class AreaSquareRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU: ");
		System.out.println("1.Area of Circle");
		System.out.println("2.Area of Square");
		System.out.println("3.Area of Right angled");
		System.out.println("4.Area of Rectangle");
		System.out.println("5.Circumference of Circle");
		System.out.println("6.Perimeter of Circle");
		System.out.println("Enter the option: ");
		int op = sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("Enter the radius of circle");
			float r = sc.nextFloat();
			float a = r * r;
			System.out.println("Area:" + a);
			break;
		case 2:
			System.out.println("Enter the side of square");
			float b = sc.nextFloat();
			float ar = b * b;
			System.out.println("Area:" + ar);
			break;
		case 3:
			System.out.println("Enter the base of right angled trinagle");
			float base = sc.nextFloat();
			System.out.println("Enter the height of right angled trianlge");
			float height = sc.nextFloat();
			float area = 0.5f * base * height;
			System.out.println("Area: " + area);
			break;
		case 4:
			System.out.println("Enter the lenght of rectangle");
			float length = sc.nextFloat();
			System.out.println("Enter the breath of rectangle");
			float breadth = sc.nextFloat();
			float are = length * breadth;
			System.out.println("Area: " + are);
			break;
		case 5:
			System.out.println("Enter the radius: ");
			float radius = sc.nextFloat();
			float circumference = 2f * 3.14f * radius;
			System.out.println("Circumference" + circumference);
			break;
		case 6:
			System.out.println("Enter the side");
			int x = sc.nextInt();
			int p = 4 * x;
			System.out.println("Perimeter" + p);
			break;
		default:
			System.out.println("Invalid option entered!......");
		}
	}

}
