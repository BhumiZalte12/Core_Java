package com.itep.corejava;

import java.util.Scanner;

public class Variabletype{
	
	  //instance  ///we cant access it without creating the object
	static String clg = "Infobeans"; //static  //without the object accessible
	//System.out.println("Enter the roll no :");
	Scanner sc = new Scanner(System.in);
	int rollno = sc.nextInt();
	
	void show()
	{
		String name="abc"; //local
		System.out.println( name);
	}
	void show1()
	
	{
		System.out.println(rollno);
	}
	public static void main(String[] args)
	{
		Variabletype obj= new Variabletype();
		obj.show();
		obj.show1();
		
	}
	
}