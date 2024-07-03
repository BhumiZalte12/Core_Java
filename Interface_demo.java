package com.itep.corejava;


interface NestedDemo1{
	void outer();
	
	interface InnerDemo1{
		void inner();
	}
}
public class Interface_demo implements NestedDemo1,NestedDemo1.InnerDemo1{
  
	public void inner() 
   {
		System.out.println("inner method in inner interface");
		
	}

	
	public void outer() {
		System.out.println("outer method in outer interface");
		
	}

	public static void main(String[] args) {
		NestedDemo1.InnerDemo1 n1 = new Interface_demo();
		
		n1.inner();
		NestedDemo1 n2 = new Interface_demo();
		n2.outer();
		
    
	}

	
	
	

}
