package com.itep.corejava;

import java.util.Scanner;

public class Triangle{
	
	
	void area() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the  breadth");
		int b = sc.nextInt();
		
		System.out.println("Enter the height");
		int h = sc.nextInt();
		
		double area = 0.5*b*h;
		System.out.println("Area of triangle is :" + area);
		
		
	}
	void perimeter()
	{
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter the  first side ");
		int first= a.nextInt();
		
		System.out.println("Enter the second side");
		int second = a.nextInt();
		
		System.out.println("Enter the third side");
		int third = a.nextInt();
		
		int peri = first+second+third;
		System.out.println("Perimeter of triangle : " + peri);
	}
	public static void main(String[] args) {
		Triangle obj = new Triangle();
		obj.area();
		obj.perimeter();
		
	}
}