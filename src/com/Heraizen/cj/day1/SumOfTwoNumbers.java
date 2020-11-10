package com.Heraizen.cj.day1;
import java.util.Scanner;

public class SumOfTwoNumbers {
	
	   public static void main(String args[]){
	   int num1, num2, sum;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Num1 value: ");
       num1 = sc.nextInt();
       
       System.out.println("Enter the Num2 value: ");
       num2 = sc.nextInt();
       
       sc.close();
       sum = num1 + num2;
       System.out.println("Sum of " + num1+ " and " + num2 + " is "+sum);

	   }

}
