package com.itep.corejava;

import java.util.Scanner;

//parent customer fields customer id ,name,mobno,ans bank account details take a
//getinfoofcustomer method ,second class is invoice in it fields are invoice id,customerid,amount 
//and create one method and display the invoice of customer
	

class Customer{
	int customer_id;
	long mob_no,account_no;
	int acc_bal;
	long total_balance ;
	String cust_name;
	public int count;
	
	void get_info()
	{
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
		//System.out.println("Enter the Amount you want to deposite :");
		//long depo = sc.nextLong();
		
	}
	
}
class Invoice extends Customer{
	int invoice_id;
	String product_name;
	int product_id;
	int quantity;
	int price;
	//int count;
	
	void invoice_details() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the invoice id :");
		invoice_id = sc.nextInt();
		System.out.println("How many products do u want to buy : ");
		count = sc.nextInt();
		for(int i = 0;i < count ;i++) {
		System.out.println("Enter the product name :");
		product_name = sc.next();
		System.out.println("Enter the product id :");
		product_id = sc.nextInt();
		System.out.println("Enter the quantity");
		quantity = sc.nextInt();
		}
		
		
	}
	void display_invoice(){
		System.out.println("Customer name is :-"+cust_name);
		System.out.println("Customer id is :"+customer_id);
		System.out.println("Customer mobile number is :"+ mob_no);
		System.out.println("Customer account number is :"+account_no);
		System.out.println("Customer total balance is :"+total_balance);
		System.out.println("Invoice id id :"+invoice_id);
		
		System.out.println("enter the product id which u want to access");
		
		
		System.out.println("product names :"+product_name);                                                                                                                            
		System.out.println("product id is :"+product_id);
		System.out.println("product quantity is :"+quantity);
		}
		
	}
	
	
	
	
	

public class CustomerInheritance {
	public static void main(String[] args) {
	Invoice i = new Invoice();
	i.get_info();
	i.invoice_details();
	i.display_invoice();
	}


}
