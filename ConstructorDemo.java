package com.itep.corejava;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("in constructor");
	}
	ConstructorDemo(int id,String name){
		System.out.println("id is:-"+ id );
		System.out.println("name is :-"+ name);
	}
	ConstructorDemo(int a){
		System.out.println(a*a*a);
	}
	public static void main(String[] args) {
		ConstructorDemo con = new ConstructorDemo();
		ConstructorDemo con1 =  new ConstructorDemo(2,"bhumi");
	                          
		
	}
}
