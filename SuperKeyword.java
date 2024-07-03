package com.itep.corejava;
//in method
class Parent{
	
	void play() {
		System.out.println("playing cricket");
		
	}
}
class Child extends Parent{
	
	void eat() {
		System.out.println("eating food");
	}
	void play() {
		super.play();
		System.out.println("playing hollyball");
	}
	
	
}

public class SuperKeyword {
public static void main(String[] args) {
	Child c = new Child();
	c.eat();
	c.play();
}
}
