package com.itep.corejava;

import java.util.Scanner;

/*
 
 * 
 * * 
 * * * 
 * * * *
 
 */

public class StarPattern3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("ENTER NUMBER:");
		 int n = sc.nextInt();
		 int i = 1;
		 while(i <= n) {
			 int j = 1;
			 while( j <= i)  {
				
				 System.out.print("*");
				 j++;
			 }
			 System.out.println();
			 i++;                                     
		 }
	}
}

