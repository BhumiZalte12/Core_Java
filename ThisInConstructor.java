package com.itep.corejava;

import java.util.Scanner;

public class ThisInConstructor {

	ThisInConstructor(){
		System.out.println("sum is :");
	}
	
	ThisInConstructor(int a,int b){
		this();
		
		int total = a+b;
		System.out.println(total);
	}

public static void main(String[] args) {
	ThisInConstructor obj = new ThisInConstructor(5,9);
}
}
