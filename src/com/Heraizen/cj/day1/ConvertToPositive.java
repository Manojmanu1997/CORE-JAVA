package com.Heraizen.cj.day1;
import java.util.*;
public class ConvertToPositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		if(n<0) {
			n=-n;
		}
		System.out.println("The result is "+n);
	}

}
