package com.itep.corejava;

import java.util.Scanner;
public class LCM2{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value 1 :");
		int num = sc.nextInt();
		System.out.println("Enter the value 2 :");
		int num2 = sc.nextInt();
		int val = (num > num2) ? num : num2 ;
		while(true) {
			
			if(val%num == 0 && val%num2 == 0) {
				break;
			}
			val++;
		}
		System.out.println("LCM is : "+ val);
	}
}