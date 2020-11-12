package com.Heraizen.cj.day1;
import java.util.Scanner;

/***
 * 
 *  Biggest of Three Numbers
 * 
 * @author Manoj
 *
 */

public class BiggestOf3Numbers {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter the 1st number num1:");
int num1=scan.nextInt();
System.out.println("Enter the 2nd number num1:");
int num2=scan.nextInt();
System.out.println("Enter the 3rd number num1:");
int num3=scan.nextInt();
int big;
if(num1>num3 && num1>num2)
{
	big=num1;
}
else if(num2>num1 && num2>num3)
{
	big=num2;
}
else
{
	big=num3;
}
System.out.println("The biggest of the 3 numbers entered is:"+big);
scan.close();
	}
}
