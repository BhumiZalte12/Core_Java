package com.itep.corejava;

public class Employee
{
	int empid;
	String empname;
	long mobileno;
	String managername;
	static String companyname = "infobeans";
	
	void  show()
	{
		String department_name = "computer science";
		System.out.println("department name is :- "+ department_name);//
	}
	
	public static void main(String args[]) {
		
		Employee obj = new Employee();
		System.out.println("company name is " + companyname);
		obj.empid=89;
		System.out.println("emp id is " + obj.empid);
		//obj1.mobileno=9087654323;
		Employee obj1 = new Employee();
		obj1.empname="bhumi";
		System.out.println("empname is " + obj1.empname);
		Employee obj2 = new Employee();
		obj2.managername="umesh";
		System.out.println(" manager name " + obj2.managername);
	
		obj.show();
		
	}
}