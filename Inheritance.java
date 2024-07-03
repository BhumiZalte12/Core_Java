package com.itep.corejava;
////create a class person ,with a fields name and age ,and method show_personal data
//and print the age ,email,add,dob and name of person create a subclass employee that extends
//to the person and a fields salary,empcode,department name,manager name,salary,date of 
//joining,method as display employee details calculate gross salary

class person{
	String name;
	int age;
	long dob;
	String email;
	
	
	
	void get_data(String n, int a, long d_o_b,String e) {
		
		name = n;
		age = a;
		dob = d_o_b;
		email = e;
	}
	
}
class employee extends person{
	
	int salary,empcode;
	String department_name,manager_name;
	int date_of_joining;
	
	void get_details(int s,int emp_c,String d_name,String m,int d_join) {
		salary = s;
		empcode = emp_c;
		department_name = d_name;
		manager_name= m;
		date_of_joining = d_join;
	}
	void display_emp() {
		System.out.println(" person name :"+name);
		System.out.println("age :"+age);
		System.out.println("date of birth :"+dob);
		System.out.println("email :"+email);
		System.out.println(" employee salary is:"+salary);
		System.out.println("employee code is :"+empcode);
		System.out.println("department name is :"+department_name);
		System.out.println("manager name is:"+manager_name);
		System.out.println("date of joining is :"+date_of_joining);
	}
	
	

}
public class Inheritance {
	public static void main(String[] args) {
		
		
		employee e = new employee();
		e.get_data("bhumi", 20,492003 ,"zaltebhumi@gmail.com ");
		e.get_details(50000, 101, "computer", "abc", 582022);
		e.display_emp();
	}
	

}
