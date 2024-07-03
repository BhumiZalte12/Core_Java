package com.itep.corejava;

import java.util.Scanner;

public class Fact{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	int fact1 = 1;
	
	
	for(int i = 1;i <= num ;i++) {
		
		fact1 = fact1*i;
			
	}
	System.out.println(fact1);
	}
}