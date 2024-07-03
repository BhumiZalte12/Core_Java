package com.itep.corejava;

import java.util.Scanner;

public class Circle
{

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius : ");
	
	int r = sc.nextInt();
	double pie = 3.14;
	double area = (pie * r * r );
	System.out.println(" Area of circle is : " + area);
	double circumference = ( 2 * pie * r );
	System.out.println("Circumference of circle is : " + circumference);
	
	
}
	
}
