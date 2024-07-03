package com.itep.corejava;

/*

create a abstract class with the name shape 3d with the abstract methods calculate volume,and calculate surface area ,create a subclass cube ,
that extends to the shape 3d class and implement 
respective methods to calculate the volume and surface area of each shape .

*/
abstract class Shape3d{
	
	float r = 5;
	int l = 12;
	int b = 15;
	int h = 20;
	int a = 10;
	float pie = 3.14f;
	abstract void calculate_volume();
	abstract void calculate_surface_area();
	
}
class Cube3d extends Shape3d{
	void calculate_volume() {
		 int v = a*a*a;
		System.out.println("Volume of cube is :"+v);
		
		int v1 = l*b*h;
		System.out.println("Volume of cuboid is:"+v1);
		
		float v3 = pie*2*h;
		System.out.println("Volume of cyclinder is :" +v3);
			

		
	}
	
	
	void calculate_surface_area() {
		int s = 6*a*a;
		System.out.println("Surface area of cube is :"+s);
		
		int s1 =2*(l*b + b*h + h*l);
		System.out.println("Surface area of cuboid is :"+s1);
		
		float s3 = pie*2*(r+h);
		System.out.println("Surface area of cyclinder is :"+s3);	
		
	}
	
	
}


public class Abstraction_ex {

	public static void main(String[] args) {
		Cube3d c = new Cube3d();
		c.calculate_volume();
		c.calculate_surface_area();

	}

}
