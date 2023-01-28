package com.JavaFundementals;

import java.util.Scanner;

public class UserInputs {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);//create scanner object
		
		//String inputs
    	String name= sc.nextLine();//string inputs
				
    	System.out.println("Name :" +name);
		
    	
    	//Integer inputs
    	int age =sc.nextInt(); //integer inputs
    	
    	System.out.println("Age:"+age);
    	
        
    	
    	//Double inputs (with calculation)

    	double bill = sc.nextDouble();
    	System.out.println(bill * 0.15);

    	        
    	    }//end main method
    	}//end class
    	
		
		