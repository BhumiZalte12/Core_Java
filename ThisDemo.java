package com.itep.corejava;


public class ThisDemo {

	int rollno;
	String Name;
	
	void get(int rollno,String Name) { //instance variables and method parameters are 
		    this.rollno =rollno;
		    this.Name = Name;                          //the same so to access it within the same class we use "this"
	}
	void show()
	{
		System.out.println("name :"+Name);
		System.out.println("roll no is :"+rollno);
	}

public static void main(String[] args) {
	ThisDemo t = new ThisDemo();
	t.get(7, "bhumi");
	t.show();
}
}