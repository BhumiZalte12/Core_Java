package com.itep.corejava;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1 = sc.nextInt();
		System.out.println("enter num2:");
		int num2 = sc.nextInt();
		System.out.println("enter num3:");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Greater number is : " + num1);
		}
			if(num2 > num1 && num2 > num3) {
				System.out.println( "greater number is :"+ num2);
			}else {
				System.out.println( "greater number is :"+ num3);
		}
	}
}
