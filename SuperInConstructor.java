package com.itep.corejava;

class School{
	School()
	{
		String a="bhumi";
		String b="riya";
		String c="jiya";
		System.out.println("school students are:"+a+" "+b+" "+c);
	}
	
}
class College extends School{
	
	College()
	{
	  super();
		System.out.println("College");
	}
	
	
}
public class SuperInConstructor {

	public static void main(String[] args) {
		College c = new College();
	

	}

}
