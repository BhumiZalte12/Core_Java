package com.itep.corejava;

import java.util.Scanner;

public class String_a{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name : ");
	String name = sc.nextLine();
	for(int i = 0 ;i < name.length();i++)
	{
		
		if(name.charAt(i)==' ') {
			
		
		
		System.out.println(name.charAt(0)+" "+name.charAt(i+1));
		
		
	}
		
	}
	
	
	
	}
}
	
	
	