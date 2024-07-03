package com.itep.corejava;

import java.util.Scanner;

interface Bank_1{
	
	void deposite();
	void withdrawal();	
	
}

class Saving_1 implements Bank_1{
    int amount;
    int total = 50000;
	
	public void deposite() {
		System.out.println("how much amount u want to deposite in current account");
		Scanner sc = new Scanner(System.in);
		amount = sc.nextInt();
		System.out.println("your deposited amount is :"+amount);
				
		
	}

	@Override
	public void withdrawal() {
		System.out.println("how much amount u want to withdraw in current account");
		Scanner sc = new Scanner(System.in);
		int amount1 = sc.nextInt();
		if (amount1 > total) {
			System.out.println("sorry insufficient account balance");
		}else {
		System.out.println("your withdraw amount is :"+amount1);
		int t = total - amount1;
		System.out.println("Remaining balance is :"+t);
		
	}
	}

	
	
}

class Current_1 implements Bank_1{

	
	
		
		int amount2;
	    int total2 = 100000;
		
		public void deposite() {
			System.out.println("how much amount u want to deposite in saving account");
			Scanner sc = new Scanner(System.in);
			amount2 = sc.nextInt();
			System.out.println("your deposited amount is :"+amount2);
					
			
	}

	@Override
	public void withdrawal() {
		
		System.out.println("how much amount u want to withdraw in saving account");
		Scanner sc = new Scanner(System.in);
		int amount2 = sc.nextInt();
		if (amount2 > total2) {
			System.out.println("sorry insufficient account balance");
		}else {
		System.out.println("your withdraw amount is :"+amount2);
		int t = total2 - amount2;
		System.out.println("Remaining balance is :"+t);
		
	}
	
}
}
public class Interaface_abstraction {
	

	public static void main(String[] args) {

	Saving_1 s = new Saving_1();
	s.deposite();
	s.withdrawal();
	
	Current_1 c =new Current_1();
	c.deposite();
	c.withdrawal();
	}
}

//write a java program to create a interface bank with abstract method deposite and withdrawal ,
//create a 2classes saving acc and current acc ,and implements both methods in each class