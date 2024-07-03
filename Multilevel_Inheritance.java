package com.itep.corejava;


//create a class called as a shape and take a attribute length,breadth,side,pi,radius,
//now a create a child class 1 with name AreaofRectangle with method finfArea ,create a second child
//class as AreaOfCircle with method find area and create a 3rd child class with name AreaOFsQUARE
//WITH METHOD FIND area

class Shape{
	
  int l;
  int w;
  int side;
  int r;
  float pie = 3.14f;
  float area;
  
  
}
class AreaRectangle extends Shape{
	
	void findarea(int length,int width) {
		l = length;
		w = width;
		area = length*width;
		System.out.println("area of rectangle :"+area);
	}
}
class AreaCircle extends Shape{
	void findarea(int radius,float p) {
		r = radius;
		p = pie;
		area = 2 * p*radius;
		System.out.println("area of circle is :"+area);
	}
}

class AreaSquare extends Shape{

	void findarea(int s) {
		side = s;
		area = s*s;
		System.out.println("Area of square is :"+area);
	}
}

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaRectangle r = new AreaRectangle();
		r.findarea(4, 7);
		AreaSquare s = new AreaSquare();
		s.findarea(5);
		AreaCircle c = new AreaCircle();
		c.findarea(5, 6);
		
		

	}

}


//create a class person ,with a fields name and age ,and method show_personal data and print the age ,email,add,dob and name of person create a subclass employee that extends to the person and a fields salary,empcode,department name,manager name,salary,date of 
//joining,method as              calculate gross salary

//create a class bank acc with fiels acc no,balance and interest rate,and a method deposite that adds the amount to the user,create a subclass saving acc that extends to the bank account and add te fiels minimum balance and adds the fiels minimum balance and a method withdraw that substract an amount from balance and show the remaining balance
