package com.itep.corejava;

import java.util.Scanner;

/*
 1 2 3 4
 1 2 3 4
 1 2 3 4
 1 2 3 4

 */
public class StarPattern5 {

		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("ENTER NUMBER:");
			 int n = sc.nextInt();
			 int i = 1;
			 
			 while(i<=n) {
				 int j = 1;
				 while(j<=n) {
					 System.out.print(" "+j);
					 j++;
				 }
				 System.out.println();
				 i++;
			 }
			 
	}
		
				 
		
		
}
