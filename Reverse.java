package com.itep.corejava;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int reverse = 0;
		while(num !=0) {
			int remainder = num % 10 ; //143 = 3  // 14 = 4  // 1 = 1
			reverse = reverse * 10 + remainder; // 0*10 + 3 = 3  // 3*10 + 4 = 34 // 34*10 + 1(340+1)= 341
			num = num / 10 ; // 143/10 = 14    // 14/10 = 1   // 1/10 = 0
			
		}
		System.out.println(reverse);
}
}