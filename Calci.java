package com.itep.corejava;

import java.util.Scanner;

public class Calci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2 : ");
		int num2 = sc.nextInt();
		System.out.println("1.Press 1 for Addition ");
		System.out.println("1.Press 2 for Substraction ");
		System.out.println("1.Press 3 for Multipication ");
		System.out.println("1.Press 4 for Division");
		int input = sc.nextInt();
		
		switch(input) {
		case 1:
		int add = num1 + num2;
		System.out.println("Addition is : " + add);
		break;
		
		case 2:
			int sub = num1 - num2;
			System.out.println("Substraction is : " +sub);
			break;
			
		case 3:
			int mul = num1 * num2 ;
			System.out.println("Multipication is : "+ mul);
			break;
			
		case 4 :
			int div = num1 / num2;
			System.out.println("division is : " + div);
			break;
			
			default:
				System.out.println("invalid input");
			
			
		}
	}
}
