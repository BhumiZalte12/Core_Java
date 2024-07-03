package com.itep.corejava;

import java.util.Scanner;

public class SI{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principle : ");
	int p = sc.nextInt();
	System.out.println("Enter the rate : ");
	int r = sc.nextInt();
	System.out.println("Enter the time period : ");
	int t = sc.nextInt();
	
	int simple_interest = p * r * t/100 ;
	System.out.println("Simple interest is : " + simple_interest  );
}
}