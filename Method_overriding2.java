
//write a java program create aclass employee with the method call calculate salary create a 2 sub classes
//manager and programmer in each sub class overrides the calculate salary method to calculate and returns 
//a salary based on their specific role

/* 
  
 */
package com.itep.corejava;

class Employe{
	
	void calculate_salary(int salary) {
		System.out.println("Salary of a Employee is : "+salary);
	}
}
class Manager extends Employe{
	

	void calculate_salary(int salary) {
		System.out.println("Salary of a manager is : "+salary);
	}
}
class Programmer extends Manager{
	

	void calculate_salary(int salary) {
		System.out.println("Salary of a programmer is : "+salary);
	}
}

public class Method_overriding2 {
	public static void main(String[] args) {
	Employe e;
	Employe a = new Employe();
	e = a;
	e.calculate_salary(90000);
	
	 Manager ma = new Manager();
	
	e = ma;
	e.calculate_salary(50000);
	
	Programmer p = new Programmer();
	 e = p;
	 e.calculate_salary(90000);
	 
	
	
	
	
	}
	
}
//create a class that contains the data and method for a ship ,this class contains the following data name of ship and year the ship was
//build class should contains the following methods getshipdata(instance = local),create a second class that contains the data and method 
//for a cruise ship ,the data members are the no of passengers, method for getting the no.of passenger,2nd for type of the passenger ,now create a third class that contain the data and methode for carboships,and datamebers no of tones it can hold 
//getno of tones ,and show the ,ship name,no ogf tones built year and all
