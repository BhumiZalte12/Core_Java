package com.itep.corejava;

import java.util.Scanner;

public class Gross_Salary{
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Basic Salary : ");
	int basic = sc.nextInt();
	
	System.out.println("Enter the Travel Allowance: ");
	int travel = sc.nextInt();
	
	System.out.println("Enter the pf: ");
	int pf = sc.nextInt();
	
	System.out.println("Enter the Petrol allowance: ");
	int petrol= sc.nextInt();
	
	System.out.println("Enter the health allowance: ");
	int health = sc.nextInt();
	
	int Gross = (basic * travel * pf * petrol * health );
	System.out.println("Gross Salary is : " + Gross);
	
	}
	}