package com.itep.corejava;

import java.util.Scanner;

/*
 1
 1 2
 1 2 3
 1 2 3 4
 */
public class StarPattern6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER NUMBER:");
		 int n = sc.nextInt();
		 int i = 1;
		 while(i <= n) {
			 int j = 1;
			 while(j <= i)
			 {
				 System.out.print(" "+j);
				 j++;
			 }
			 System.out.println();
			 i++;
		 }
	}
}
