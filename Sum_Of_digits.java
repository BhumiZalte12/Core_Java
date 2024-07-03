package com.itep.corejava;

import java.util.Scanner;

public class Sum_Of_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
			int sum =0 ;
			 
				while(n!=0) {
			int digit = n%10; //123 = 3 //12 = 2 //1
			sum = sum + digit; //3+0 = 3 //3 +2 = 5 // 5+1 = 6
			n = n/10; //12 // 1 // 0
			
		}
		System.out.println(sum);

	}

}
