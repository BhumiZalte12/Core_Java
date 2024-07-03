package com.itep.corejava;


 abstract class Student_Info {
	  int std ;
	 String div;
		
	final int n = 20;
	Student_Info(){
		System.out.println("This is Constructor OF PARENT class");
	}
	void ClassData()
	{
		System.out.println("this is in  parent class method");
	}
   static void ExamData()
   {  
	   
	   System.out.println("this is a static method");
	   
   }
   abstract void show();
   abstract void get();
   
   
	
}
