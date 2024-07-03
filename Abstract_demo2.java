
/*
 //write a java program to create a bank account with the bank account with abstract methods deposite and withdraw and create a subclasses saving account and  cuurrent acc that 
//extends the bank acc parent class and implementsd the respective methods to handle the deposite and withdrawels for each acc type

 */

package com.itep.corejava;

import java.util.Scanner;

abstract class Bank_ac{
	int customer_id;
	long mob_no,account_no;
	int acc_bal;
	long total_balance ;
	String cust_name;
	long depo;
	long depo_current;
	long with_current;
	long with;
	long total;
	long total1;
	
	abstract void deposite();
	abstract void withdraw();
	
	
}
class Saving_ac extends Bank_ac{
	
	void user_details() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name is :");
		cust_name = sc.next();
		System.out.println("Enter the customer id :");
		customer_id = sc.nextInt();
		System.out.println("Enter the mobile number :");
		mob_no = sc.nextLong();
		System.out.println("Enter the account number :");
		account_no = sc.nextLong();
		System.out.println("Enter the account balance");
		acc_bal = sc.nextInt();
		
		
	}
	
	void deposite() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount you want to deposite in saving account :");
	    depo = sc.nextLong();
	    total = acc_bal + depo;
	    System.out.println("Total account balance in saving account is :"+total);
	     
	}
	
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount you want to withdraw in saving account :");
	    with = sc.nextLong();
	    long total_final = total - with;
		  System.out.println("Total account balance after withdraw is in saving account is :"+total_final);
	   
				
	}
}

class Current extends Bank_ac{
	void deposite() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount you want to deposite in Current account:");
	    depo_current = sc.nextLong();
	    total1 = acc_bal + depo_current;
	    System.out.println("Total account balance in Current account is :"+total1);
	     
				
	}
	void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount you want to withdraw :");
		with_current = sc.nextLong();
	    long total_current = total - with_current;
		  System.out.println("Total account balance after withdraw is :"+total_current);
	   
				
	}
		
	}
	

public class Abstract_demo2 {

	public static void main(String[] args) {
		
		Bank_ac ac;
		Saving_ac s = new Saving_ac();
		ac =s;
				
		Current c = new Current();
		ac =c;
		System.out.println("USER DETAILS ARE : ");
		s.user_details(); 
		System.out.println(" **********************************************************************************");
		System.out.println("which account information do you want to display current or savings press : ");
		System.out.println("press 1 for Saving account and press 2 for Current account");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			s.deposite();
			s.withdraw();
		}
		else {
		
		c.deposite();
		c.withdraw();
		}
	}

}

