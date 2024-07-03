package com.itep.corejava;

import java.util.Scanner;

////create a class bank account with field account no,balance and interest rate,and a method deposite 
//that adds the amount to the user,create a subclass saving account that extends to the bank account and 
//add the fields minimum balance  and a method withdraw that substract 
//an amount from balance and show the remaining balance
class Bank1{
	long acc_no;
	int acc_bal;
	int interest_rate;
	long total_balance ;
	
	void deposite() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number :");
		acc_no = sc.nextLong();
		System.out.println("Enter the account balance");
		acc_bal = sc.nextInt();
		System.out.println("Enter the Amount you want to deposite :");
		long depo = sc.nextLong();
		System.out.println("Enter the interest rate:");
		interest_rate = sc.nextInt();		
		 total_balance = acc_bal + depo;
		System.out.println("Total balance is : "+total_balance);
		
	}
	
}
class Saving_account extends Bank1{
	
	void withdraw() {
	
	long min_bal;
	long withdraw_amount ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Amount you want to withdraw  :");
	withdraw_amount = sc.nextLong();
	
	if(withdraw_amount > total_balance) {
		System.out.println("Sorry you cannot withdraw due to insufficient balance");
		
	}else {
		
		min_bal = total_balance - withdraw_amount;
		System.out.println("Minimum balance is :"+min_bal);
	}
	
	
	}
	
}
public class Inheritance2 {
public static void main(String[] args) {
	
	Saving_account s = new Saving_account();
	s.deposite();
	s.withdraw();
	
}
}
