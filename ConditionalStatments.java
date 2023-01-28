package com.JavaFundementals;

import java.util.Scanner;

public class ConditionalStatments {
	
	public static void main(String[] args) {
	      
	      @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	      int temp = sc.nextInt();

	      if(temp >= 100){

	    System.out.println("Boiling");
	      }//end if

	    else{

	System.out.println("Not Boiling");
	    }  //end else

	     
//switch statments
	      String color = sc.nextLine();

	      switch(color){

	      case "red" : System.out.println(1);
	                 break;

	      case "green" : System.out.println(2);
	                 break;   

	      case "black" : System.out.println(3);
	                 break;                

	      default: System.out.println(3); 

	      }//end switch
	      
	    }//end main method
	
}//end class

