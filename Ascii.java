package com.itep.corejava;

import java.util.Scanner;

public class Ascii{
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
//		
//		String ch = sc.next();
//		
//		a = ch.charAt(0);
//		System.out.println("ASCII VALUE IS : - " + a);
	//	int ascii = ch;
		short num = sc.nextShort();
		char c = (char) num;
		System.out.println("Ascii value of :" + c);
		
	}
}
