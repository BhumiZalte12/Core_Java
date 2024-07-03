package com.itep.corejava;

import java.util.Scanner;

public class Person {
 int agee;
 String namee;
	public Person(int age ,String name) {
		
		agee = age;
		namee  = name;
		
	}
	void show() {
		System.out.println("Age is : "+agee);
		System.out.println("Name is : "+namee);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		System.out.println("Enter the name");
		String name = sc.next();
		
		
		Person p = new Person(age,name);
		//Person p1 = new Person(age,name);
		p.show();
		
		
	}
}
