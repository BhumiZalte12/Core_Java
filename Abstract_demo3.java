/*
 /*
 write a java program to create a abstract class employee with abstract methods cal_salary and display_info .
 create the sub classes manager and programmer that extends the employee class and implement the
 respective methods to calculate salary and display info.for each role 
  
 * *
 */

package com.itep.corejava;

import java.util.Scanner;

abstract class Employeee{
	int manager_id;
	String manager_name;
   int manager_total_salary;
   int m_Basic_Salary;
   int m_Dearness_allowance;
   int m_house_rent_allowance;
   int m_Medical_allowance;
   int m_income_tax;
   int m_pf;
   
   int programmer_id;
  String programmer_name;
  int programmer_total_salary;
  int p_Basic_Salary;
  int p_Dearness_allowance;
  int p_house_rent_allowance;
  int p_Medical_allowance;
  int p_income_tax;
  int p_pf;
	
	
	
	abstract void calculate_salary();
	abstract void display_info();
	
	
	
}
class Managerr extends Employeee{
	
	void calculate_salary(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the manager id :");
		manager_id =sc.nextInt();
		System.out.println("Enter the manager name :");
		manager_name =sc.next();
		System.out.println("Enter the manager basic salary :");
	   m_Basic_Salary=sc.nextInt();
	   System.out.println("Enter the manager Dearness allowance :");
	   m_Dearness_allowance=sc.nextInt();
	   System.out.println("Enter the manager house rent allowance :");
	    m_house_rent_allowance=sc.nextInt();
	    System.out.println("Enter the manager medical allowance :");
	    m_Medical_allowance=sc.nextInt();
	    System.out.println("Enter the manager income tax :");
	    m_income_tax=sc.nextInt();
	    System.out.println("Enter the manager pf  :");
	    m_pf=sc.nextInt();
	    
	}
	
	void display_info() {
		manager_total_salary =( m_Basic_Salary + m_Dearness_allowance+ m_house_rent_allowance + m_Medical_allowance )- ( m_income_tax + m_pf);
		System.out.println("Manager id is :"+manager_id);
		System.out.println("Manager name is :"+manager_name);
		System.out.println("Manager basic salary is :"+m_Basic_Salary);
		System.out.println("Manager Dearness allowance is :"+m_Dearness_allowance);
		System.out.println("Manager house rent allowance :"+ m_house_rent_allowance);
		System.out.println("Manager medical rent allowance :"+m_Medical_allowance);
		System.out.println("Manager income tax is :"+m_income_tax);
		System.out.println("Manager pf is :"+m_pf);
		System.out.println("Total salary of Manager is :"+manager_total_salary);
	}
}
class Programmers extends Employeee{

	void calculate_salary(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the programmer id :");
		programmer_id =sc.nextInt();
		System.out.println("Enter the programmer name :");
		programmer_name =sc.next();
		System.out.println("Enter the programmer basic salary :");
	   p_Basic_Salary=sc.nextInt();
	   System.out.println("Enter the programmer Dearness allowance :");
	   p_Dearness_allowance=sc.nextInt();
	   System.out.println("Enter the programmer house rent allowance :");
	    p_house_rent_allowance=sc.nextInt();
	    System.out.println("Enter the programmer medical allowance :");
	    p_Medical_allowance=sc.nextInt();
	    System.out.println("Enter the programmer income tax :");
	    p_income_tax=sc.nextInt();
	    System.out.println("Enter the programmer pf  :");
	    p_pf=sc.nextInt();
	    
	} 
	    void display_info() {
	    	programmer_total_salary =( p_Basic_Salary + p_Dearness_allowance+ p_house_rent_allowance + p_Medical_allowance )- ( p_income_tax + p_pf);
			System.out.println("programmer id is :"+programmer_id);
			System.out.println("programmer name is :"+programmer_name);
			System.out.println("programmer basic salary is :"+p_Basic_Salary);
			System.out.println("programmer Dearness allowance is :"+p_Dearness_allowance);
			System.out.println("programmer house rent allowance :"+ p_house_rent_allowance);
			System.out.println("programmer medical rent allowance :"+p_Medical_allowance);
			System.out.println("programmer income tax is :"+p_income_tax);
			System.out.println("programmer pf is :"+p_pf);
			System.out.println("Total salary of programmer is :"+programmer_total_salary);
		}
	
}
public class Abstract_demo3 {

	public static void main(String[] args) {
	Managerr m = new Managerr();
	m.calculate_salary();
	m.display_info();
	Programmers p = new Programmers();
	p.calculate_salary();
	p.display_info();
	

	}

}
