package com.itep.corejava;

import java.util.Scanner;

public class Railway {
//regi_id,pass_name,seat_no,ticket_price,pickup_point,drop_point
	
	int reg_id,seat_no,ticket_price;
	String pass_name,pickup_point,drop_point;
	
	void get(int r_id,String p_name,int s_no,int t_price,String p_point,String d_point) {
		
		reg_id = r_id;
		seat_no = s_no;
		ticket_price = t_price;
		pass_name = p_name;
		pickup_point = p_point;
		drop_point = d_point;
	}	
		void show() {
			System.out.println("Registration id is : "+reg_id);
			System.out.println("passenger name is :"+pass_name);
			System.out.println("user seat number is : "+seat_no);
			System.out.println("ticket price is : "+ticket_price);
			System.out.println("pick up point is : "+pickup_point);
			System.out.println("drop point is : "+drop_point);
			
		}
		public static void main(String[] args) {
			Railway obj = new Railway();
			
			Scanner sc = new Scanner(System.in);
			

			System.out.println("Enter the id: ");
			int r_id = sc.nextInt();
			
			System.out.println("Enter the name: ");
			String p_name = sc.next();
			
			System.out.println("Enter the seat number: ");
			int s_no = sc.nextInt();
			
			
			System.out.println("Enter the ticket price : ");
			int t_price= sc.nextInt();
			
			System.out.println("Enter the pick up point : ");
			String p_point = sc.next();
			
			System.out.println("Enter the drop point: ");
			String d_point= sc.next();
			
			obj.get(r_id,p_name,s_no,t_price,p_point,d_point);
			obj.show();
		
		
	}
}
