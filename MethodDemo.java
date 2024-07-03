package com.itep.corejava;

import java.util.Scanner;

public class MethodDemo {
	
	public void display()//method defn
	{
		System.out.println("In a display method");
	}
	void area(int l,int b)//parameterized method
	{
	int area = l*b;
	System.out.println(area);
	}
	

	public static void main(String[] args) {
		
		MethodDemo obj = new MethodDemo();
		obj.display();
		obj.area(4,8);
		//from user
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		obj.area(a, b);
		
	}
	
	

}
