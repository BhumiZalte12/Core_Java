package com.itep.corejava;

import java.util.Scanner;

public class Evenodd {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value 1 :");
		int num = sc.nextInt();
		
		if(num % 2 == 0 ) {
			System.out.println("Number is even ");
		}
		else {
			System.out.println("Number is odd");
		}
}
}
