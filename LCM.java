package com.itep.corejava;

import java.util.Scanner;
public class LCM{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value 1 :");
		int num = sc.nextInt();
		System.out.println("Enter the value 2 :");
		int num2 = sc.nextInt();
	
		int i ;
		int gcd = 1;
		for(i = 1; i <= num &&  i <= num2 ; ++i);{
		
			if(num%i == 0  && num2%i==0)
			{
				gcd = i;
			}
			
		}
			System.out.println("GCD Is : " + gcd);
		
	
		int lcm = (num * num2)/gcd;
		System.out.println("LCM is : " + lcm);
	}
}