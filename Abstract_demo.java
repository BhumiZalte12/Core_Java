package com.itep.corejava;


//parent with the name as a area (hierachical inheritance) parent is abstract class variables like length,breadth 'pi and radius (manually input values)and take abstract method name = findarea 
//two child classes are rectangle and circle and override the methods ,and access through upcasting

abstract class Areaa{
	int l = 30;
	int b = 50;
	final float pi = 3.14f;
	float r = 5;
	int area;
	
	abstract void find_area();
  
	
	
}
class Rectanglee extends Areaa{
	void find_area() {
		area = l*b;
		System.out.println("Area of rectangle is:"+area);
	}
	
	
}
class Circlee extends Areaa{
	void find_area() {
		float area_of_circle = pi * r * r;
		System.out.println("Area of Circle is:"+area_of_circle);
	}
	
}

public class Abstract_demo {
	

	public static void main(String[] args) {
		Rectanglee r = new Rectanglee();
		r.find_area();
		Circlee c = new Circlee();
		c.find_area();
		
		
		

	}

}


