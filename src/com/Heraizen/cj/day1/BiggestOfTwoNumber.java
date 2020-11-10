package com.Heraizen.cj.day1;
import java.util.*;
public class BiggestOfTwoNumber {

	public static void main(String[] args) {
		 int num1, num2;
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the Num1 value: ");
	       num1 = sc.nextInt();
	       
	       System.out.println("Enter the Num2 value: ");
	       num2 = sc.nextInt();
	       
	       sc.close();
	       if(num1<=num2) {
		       System.out.println("The biggest of the two numbers entered (" + num1+ " and " + num2 + ") is "+num2);
	       }
	       else
	    	   System.out.println("The biggest of the two numbers entered (" + num1+ " and " + num2 + ") is "+num1);
	}

}
