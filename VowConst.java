package com.itep.corejava;

import java.util.Scanner;

public class VowConst{

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Character : ");
	char s = sc.next().charAt(0);
	if(s == 'a' || s == 'e' || s == 'i' || s == 'o'|| s == 'u') {
		System.out.println("Character is Vowel");
	}
	if(s == 'A' || s == 'E' || s == 'I' || s == 'O'|| s == 'U') {
		System.out.println("Character is Vowel");}
	
	else {
		System.out.println("Character is consonant");
	}
	
		
	
	}
}

