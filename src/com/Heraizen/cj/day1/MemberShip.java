package com.Heraizen.cj.day1;
import java.util.Scanner;

public class MemberShip {
	public static void main(String args[]) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		//sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Enter the mobile number:");
		long mobilenum=sc.nextLong();
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Congratulations "+name+" for your successful registration.");
			
		}
		else
		System.out.println("Sorry! You need to be at least 18 years old to get membership.");
		
		sc.close();
	}
	

}