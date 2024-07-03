package com.itep.corejava;

import java.util.Scanner;

public class Student_p{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the math marks :");
	int math = sc.nextInt();
	System.out.println("Enter the bio marks :");
	int bio = sc.nextInt();
	System.out.println("Enter the chem  marks :");
	int chem = sc.nextInt();
	System.out.println("Enter the phy marks :");
	int phy = sc.nextInt();
	System.out.println("Enter the cs marks :");
	int cs = sc.nextInt();
	
	double t = math + bio + chem + phy + cs ;
	double total = (t / 500 *100);
	System.out.println("Average student Percentage : " + total);
	}
	}




















































