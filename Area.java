package com.itep.corejava;

//find the area of triangle ,area of rectangle,square,circle
public class Area {

	public Area(int b ,int h) 
	{
	//int area = b * h;
		System.out.println("area of triangle is : "+ 0.5*b*h);
	}
	Area(float w,float l){
		//float area2 = w*l;
		System.out.println("Area of rectangle is :"+ w*l);
	}
	Area(int side){
		//int area3 = side*side;
		System.out.println("Area of square is :"+side*side);
	}
	Area(float r){
		//float area4 =  r * r;
		System.out.println("Area of circle is :"+3.14*r*r);
	}
	public static void main(String[] args) {
		Area a = new Area(15,78);
		new Area(15.8f,15.9f);
		new Area(5);
		new Area(8.5f);
		
		
	}
}
