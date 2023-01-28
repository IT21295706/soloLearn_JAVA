package com.JavaFundementals;

public class MultipleConditions {
	
		  public static void main(String[] args){

		int age = 20;
		int weight = 70;

//&&(AND) condition
		
		if(age < 40 && weight <80){
		  System.out.println("You're in");
		}//end if
		
// ||(OR) condition
		
		if(age < 40 || weight >80){
			  System.out.println("You're Welcome!");
			}//end if
		
		
// (!(..)) (NOT)
		
		int Age =25;
		
		if(!(Age > 20)) {
			System.out.println("you're still a kiddo");
		}//end if
		
		else {
			System.out.println("you're welcome sir!");
		  }//end else
	
		
 //All in one
		
	 String country = "India";
	 int AGE = 45;
	 
	 if((country == "GB" || country == "USA") && (AGE >0 && AGE <100)) {
		 System.out.println("Allowed");
	 }//end if
	 
	 else {
		 System.out.println("Not allowed!");
	 }//end else
	 
	 if(age>=0 && age<=11){
		 System.out.println("child");
		        }//end if

		        else if(age >= 12 && age <= 17){
		 System.out.println("Teen");
		        }//else if

		        else{
		 System.out.println(age >=18 && age <=64);
		     System.out.println("Adult");
		        }//end else
	 

 }//end main
}//end class

