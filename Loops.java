package com.JavaFundementals;

public class Loops {
	
	public static void main(String[] args) {
		
		//while loops
		//decrement operator
		//method1
		int x = 3;
		
		while(x >0) {
			System.out.println(x);
		    x =x-1; //if not loop will print 3 infinitly
		    
		}//end while
		
System.out.println("*******************************************************************");		
		//method2
		
		while(x>0) {
			
			System.out.println(x);
			x -- ;
		}//end while
		
System.out.println("*******************************************************************");
		
		
		//increment operator
		int y =1;
		
		while(y <=10) {
			
			System.out.println(y);
			y++;
		}//end while
		
System.out.println("*******************************************************************");		
		//to print only even numbers
		
		while(y <=10) {
		
			System.out.println(y);
			y = y + 2; //or y+=2
			
		}//end while
		
		
System.out.println("*******************************************************************");				
	
//calculation
	int sum =0;
	int num =0;
	
	while(num <=100) {
		
		sum +=num;
		num ++;
	}//end while
	
	System.out.println(sum);

	
	System.out.println("***********************do while****************************");	
	
	int z = 1;
    do {
        System.out.println(z);
        z++;
    } while(z < 5);
	}//end main method
}//end class
