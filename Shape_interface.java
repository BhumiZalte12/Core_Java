package com.itep.corejava;

/*//write a program to create a interface shape with abstract method getarea(),create a 3 classes rectangle,circle,triangle 
//that implements the shape interface ,implements the getarea method for each of the 3 classes
 * */
 

interface Shape_1{
	
	void get_area();
	
}
class Rectangle_1 implements Shape_1{

	@Override
	public
	 void get_area() {
		int l = 8;
		int b = 6;
		int area = l*b;
		System.out.println("area of rectangle is : "+area);
	}
	
}
class Circle_1 implements Shape_1{

	@Override
	public void get_area() {
	 double pie = 3.14d;
	 float r = 4;
	 System.out.println("area of circle is :" + pie*r*r);
	 	 
		
	}
	
}
class Triangle_1 implements Shape_1{

	@Override
	public void get_area() {
		int side = 5;
		System.out.println("area of triangle is :" + side*side*side);
		
	}
	
	
}

public class Shape_interface {

	public static void main(String[] args) {
		Triangle_1 t = new Triangle_1();
		t.get_area();
		Circle_1 c = new Circle_1();
		c.get_area();
		Rectangle_1 r = new Rectangle_1();
		r.get_area();
 
	}

}
