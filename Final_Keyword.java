package com.itep.corejava;
/*in class take one intance variable with the final keyword ,try to modifiy in method and print ,also change for local variable it access or not
*/

public class Final_Keyword 
{


		int roll_no = 5;
		String name = "bhumi";
		final int id = 2;
		
		void show()
		{   // id = 6;
		     roll_no = 10;
		     System.out.println(roll_no);
			System.out.println(id);
			
		}
		
		


public static void main(String[] args) 
{
	 Final_Keyword obj = new  Final_Keyword();
	 obj.show();

}
}
