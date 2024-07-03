package com.itep.corejava;

import java.util.Scanner;

public class Product {
//productid,pname.pprice,quantity,pbrand //instance
	//get product(_ _) - from user ,instance = local var
	//show product 
	
	int pId,pprice,pquantity,pbrand;
	String pname;
	
	void getProduct(int pro_id,int pro_price) {
		pId = pro_id;  //for accessing local variables in show method ,we have to 
		                       //intializes instance variable as a local variable
		pprice = pro_price;
	}
	void showProduct() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product name ");
		pname = sc.next();
		
		System.out.println("Enter the product quantity");
		pquantity = sc.nextInt();
		
		
		
		System.out.println("product id is : " + pId);//taken from local variable
		System.out.println("Product id is : "+pprice);
		
		System.out.println("product name is :"+pname);
		System.out.println("product quantity is :"+pquantity);
		System.out.println("product quantity is :"+pquantity);
		
	}
	
	public static void main(String[] args) {
		Product obj = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id ");
		int pro_id = sc.nextInt();
		System.out.println("Enter the product price");
		int pro_price = sc.nextInt();
		obj.getProduct(pro_id, pro_price);
		obj.showProduct();
		
	}
}
