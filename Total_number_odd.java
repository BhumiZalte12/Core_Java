package com.itep.corejava;

public class Total_number_odd {
      public static void main(String[] args) {
	 
    	  int count = 0;
    	  
    	  for(int num = 1 ;num < 100;num++) {
    		  if(num%2 != 0) {
    			  count++;
    		  }
    	  }
    	  System.out.println(count);
    	  
}
	
}
