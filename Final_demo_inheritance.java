package com.itep.corejava;

/*check inheritance ,check parent class variable as a final and modify in child class ,check the modify or not
check in cunstructor
make static variable final*/
/*
 take one method show with final in parent and another method display in child and access it with it child obj. //check for method overriding case
 parent with final variable and called by super in child class
 */
 

 class Parent2{  //we cannot use the final keyword in inheritance
	String n = "bhumi";
	final static int id = 10;
	public int rollno = 5;
  
	
	 final void show() {
		 rollno++;
	//	 id++;                                                 //cannot modify
		System.out.println("in parent");
		System.out.println("name is :"+ n);
		System.out.println("final id is :"+id);
		System.out.println("rollno is "+rollno);
	}
	
}

class Child2 extends Parent2{
    
	int id = 9;
	int rollno = 10;
	void display() {
		System.out.println("id is :"+id);
		System.out.println("id is :"+super.id);
		
	}
	
}
public class Final_demo_inheritance {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.show();
		c.display();
		System.out.println("id is :"+Parent2.id);

	}
}



