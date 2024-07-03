package com.itep.corejava;

import java.util.Scanner;

public class Rectangle{
	
	
	void area() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the width of reactangle");
		int w = sc.nextInt();
		
		System.out.println("Enter the length of reactangle");
		int l = sc.nextInt();
		
		
			
			int area = (w * l);
			System.out.println("Area of reactangle is :"+area );
		
		
		
		int perimeterR = 2 * w * l ;
		System.out.println("Perimeter of rectangle is : " + perimeterR);
	}
		
		
		public static void main(String[] args) {
			Rectangle obj = new Rectangle();
			obj.area();
			
				
			
		
	}
}