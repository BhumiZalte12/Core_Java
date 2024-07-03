package com.itep.corejava;

class Vehiclee{
	// super keyword in java example 

		int maxSpeed = 120; 
	} 

	// sub class Car extending vehicle 
class Type extends Vehiclee { 
		int maxSpeed = 180; 

		void display() 
		{ 
			// print maxSpeed of base class (vehicle) 
			System.out.println("Maximum Speed: "+super.maxSpeed); 
		} 
	} 

	// Driver Program 
	public class SuperExample { 
		public static void main(String[] args) 
		{ 
			Type small = new Type(); 
			small.display(); 
		} 
	}


