package Lab2;

import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter your number: n= ");
			while (!in.hasNextInt()) {
				System.out.print("Error. Please enter only non-negative numbers");
				in.next();
			}
			n = in.nextInt();
		} while (n<= 0 && n > 0);
		in.close();
		
		
		if (n>=15 || n<0) {
		System.out.print("Error. Please enter non-negative numbers up to 15");
		}
		else {
		long result = 1;
	    for(int i = 1; i<=n; i++) {
	    	result= result*i;
	    }
	    int a = 2;
	    int factorial =1;
	    System.out.println("The factorial of the number n is: "+"n!"+"= "+result);	
		
	   	
		
	    while(a<=n) {
	    	factorial = factorial*a;
	    	a++;
	    	
	    }System.out.println("The factorial of the number n is: "+"n!"+"= "+factorial);
		}
	  }
	}exit
	
           
