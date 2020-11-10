package com.Heraizen.cj.day1;
import java.util.Scanner;

public class SwapOfTwoNumbers {

	public static void main(String[] args) {
		float num1,num2;
		Scanner sc = new Scanner(System.in);
		
		        System.out.println("Enter the first number num1: ");
		        num1=sc.nextFloat();
		        
		        System.out.println("Enter the Second number num2: ");
		        num2=sc.nextFloat();
		        System.out.println("Before swap, the values of num1 = "+num1+" and num2 = "+num2);

		        num1 = num1 - num2;
		        num2 = num1 + num2;
		        num1 = num2 - num1;
		        System.out.println("After swap, the values of num1 = "+num1+" and num2 = "+num2);
		 

	}

}
