package com.Heraizen.cj.day1;
import java.util.Scanner;

/***
 * 
 * Write a program to accept a number from the user and count the number of odd digits.
 * 
 * @author Manoj
 *
 */
public class CountPrimeDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			int mod=num%10;
			if(mod%2==0) {
				count++;
				}
			num=num/10;
		}
		System.out.println(count);

		sc.close();
	}

}
