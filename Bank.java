package com.itep.corejava;

public class Bank {
	long acc_no;
	int ifsc;
	String acc_holder_name;
   String acc_type;
	int account_number;

	public Bank(long acc_n,int ifsc_code,String acc_holder,String account_type) {
		acc_no =acc_n;
		ifsc = ifsc_code;
		acc_holder_name=acc_holder;
		acc_type=account_type;
		
	}
	void show()
	{
		System.out.println("account number is :"+acc_no);
		System.out.println("account holder name is :"+acc_holder_name);
		System.out.println("ifsc code is :"+acc_type);
		System.out.println("account type is :"+acc_type);
	}
	public static void main(String[] args) {
		Bank b = new Bank(12358900987L,7654,"bhumi","saving");
		b.show();
	}
}
