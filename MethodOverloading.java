package com.itep.corejava;

//take a class mathoperations in that take a multiple method like arithmeticoperations(4),
//comparingnumbers(2)max from 2 numbers and max from 3 numbers 
public class MethodOverloading {

	void arithmetic_operations(int a,int b,int c) {
		int sum = a + b + c;
		System.out.println("sum is :"+sum);
	}
	void arithmetic_operations(int a,int b) {
		int sub = a - b;
		System.out.println("Substraction is :"+sub);
	}
	void arithmetic_operations(float a,float b,float c) {
		float mul = a*b*c;
		System.out.println("Multiplication is :"+mul);
		
	}
	void arithmetic_operations(float a ,float b) {
		float div = a/b;
		System.out.println("Division is :"+div);
	}
	
	void comparing_numbers(int a,int b) {
		if(a > b) {
			System.out.println("max is a :"+a);
		}else {
			System.out.println("Max is b :"+b);
		}
	}
	
	void comparing_numbers(int a,int b,int c) {
		if(a > b && a > c) {
			System.out.println("Max is a :"+a);
		}else if(b > a && b > c) {
			System.out.println("Max is b : "+b);
		}else {
			System.err.println("Max is c:"+c);
		}
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.arithmetic_operations(55,20,90);
		m.arithmetic_operations(4,7);
		m.arithmetic_operations(45f, 34f,55f);
		m.arithmetic_operations(55f, 2f);
		
		m.comparing_numbers(6, 17);
		m.comparing_numbers(9, 100, 67);

	}

}
