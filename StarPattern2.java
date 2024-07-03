package com.itep.corejava;

import java.util.Scanner;

/*
 * * * *
 * * *
 * *
 * 
 
 */
public class StarPattern2 {

	
	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("ENTER NUMBER:");
		 int n = sc.nextInt();
		 int i = 1;
		 while(i <= n) {
			 int j = n;
	        while(j >= i) {
	        	System.out.print("*");
	        	j--;
	        	
	        }
	        System.out.println();
	        i++;
		 }
		 }
}