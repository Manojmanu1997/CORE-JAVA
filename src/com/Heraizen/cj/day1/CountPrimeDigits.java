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
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= s.nextInt();
		int m,k=0;
		while(n>0)
		{
			m=n%10;
			n=n/10;
			int count =0;
	        for(int i=2;i<=m/2;i++)
	        {
	        	if(m%i==0)
	        	{
	        		count++;
	        	}
	        }
	        if(count==0&&!(m<=1))
	        {
	        	k++;
	        }
			
			
		}
		System.out.println(k);
		s.close();
	}

}
