package com.Heraizen.cj.day1;
import java.util.*;
public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principal amount: ");
		int p = sc.nextInt();
		
		System.out.println("Enter the rate of Intrest: ");
		float r = sc.nextFloat();
		
		System.out.println("Enter the time (year) : ");
		int t = sc.nextInt();
		
		float si=(p*t*r)/100;
		System.out.println("Simple Intrest is "+si);

	}

}
