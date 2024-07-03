package com.itep.corejava;

import java.util.Scanner;

public class Lcm_gcd {
	public static void main(String[] args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("ENTER THE FIRST NUMBER:");
	 int n1 = sc.nextInt();
	 System.out.println("ENTER THE SECOND NUMBER:");
	 int n2 = sc.nextInt();
		// TODO Auto-generated method stub
    int gcd = 1;
   int tn1 = n1;
   int tn2 = n2;
    
    while(n1 % n2 != 0) {
    	int rem  = (n1%n2);
    	n1 = n2;
    	n2 = rem;
	}
    System.out.println("GCD IS : "+ n2);
    System.out.println("ENTER THE FIRST NUMBER:");
	  int lcm = (tn1 * tn2)/ gcd;
    System.out.println("LCM IS : " + lcm);
}
}
