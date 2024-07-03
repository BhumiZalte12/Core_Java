package com.itep.corejava;

import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character :");
		String a1 = sc.next();
		int a = a1.charAt(0);
		//System.out.println(" " + a);
		
		if(a >= 65 && a <= 90) {
			System.out.println("Character is uppercase");
		}
		else if(a >=97 && a <=122){
			System.out.println("Chracter is lowercase");
		}
		else {
			System.out.println("Character is special character ");
		}
	}
}
//A = 65
//Z = 90
//a = 97
//z = 122
//P = 112