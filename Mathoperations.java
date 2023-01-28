package com.JavaFundementals;

public class Mathoperations {

	public static void main(String[] args) {
		
	//method1
		int x = 5;
		int y = 6;
		
		System.out.println(x+y);
		
	//method2
		double mark1 = 25.2;
		double mark2 = 10.0;
		
		double sum = mark1 + mark2;
		
		System.out.println(sum);
		
		
	//subtraction
		double salary = 50000;
		double tax = 10000;
		
		double basic_salary = salary - tax;
		
		System.out.println(basic_salary);
		
	//multiplication
		int price = 100;
		
		System.out.println(price*0.2);
		
	//division
		int marks = 100;
		int noOfStudents = 2;
		
		int avg = marks/noOfStudents;
		
		System.out.println(avg);
		
    //remainder(modulo)
		int items = 23;
		int res = items % 5;
		
		System.out.println(res);
		
	//string combination(concatenation)
		
		String FirstName = "Ranuri";
		String LastName = "Vidyaratna";
		
		String fullName1 = FirstName+LastName;
		String fullName2 = FirstName+""+LastName;

		System.out.println(fullName1);
		System.out.println(fullName2);
		
		int wins = 54;
        int ties = 31;

        double pointsEarned = wins + 0.5*ties; 
  System.out.println(pointsEarned);
	}//end main
}//end class
