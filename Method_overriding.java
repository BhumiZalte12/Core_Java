//write a java program to create a parent class as a animal with the method called as 
//a sound ,create 2 sub classes bird and cat ,override the sound method in each sub class 
//to make a specific sound for each animal

//DOWNCASTING

package com.itep.corejava;


class Animal{
	void sound() {
		
		System.out.println("sound of a tiger");
	}
}
class Bird extends Animal{
	void sound() {
		System.out.println("sound of a bird");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("sound of a cat");
	}
}
public class Method_overriding {
public static void main(String[] args) {
	Animal a;
	Animal obj1 = new Animal();
	a = obj1;
	a.sound();
	
	Bird obj2 = new Bird();
	a = obj2;
	a.sound();
	
	Cat obj3 = new Cat();
	a = obj3;
	a.sound();
	
}
}
