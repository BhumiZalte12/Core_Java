package com.itep.corejava;

import java.util.Scanner;

public class Leapyear {
	

		public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the year :");
				int num = sc.nextInt();
				
				if(num % 4 == 0) {
					System.out.println("Year is leap year");
				}else {
					System.out.println("Year is not leap year");
				}
		}
}

