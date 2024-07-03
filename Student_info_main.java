package com.itep.corejava;


class child1 extends Student_Info{
	child1(){
		
		super();
		System.out.println("This is constructor of child class");
		
	}
	
	void ClassData( int std , String div)
	{   

		this.std = std;
		this.div = div;
		
		System.out.println("std is :"+std);
		System.out.println("div is :"+div);
		
		this.ClassData();
		
	}
	void get() {
		System.out.println("this is absract method from parents class");
	}
	void show()
{
		System.out.println("this is also absract method from parents class");
		System.out.println("id is : " + n);
}
	
}

public class Student_info_main {

	public static void main(String[] args) {
		child1 c = new child1();
		c.ClassData(14,"BHUMI");
		c.get();
		c.show();
		
		Student_Info.ExamData();

	}

}




