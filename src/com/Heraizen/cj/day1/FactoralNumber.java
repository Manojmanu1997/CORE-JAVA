package com.Heraizen.cj.day1;
import java.util.*;
public class FactoralNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num,fact=1;
        System.out.println("Enter any number:");
        num=scan.nextInt();
        for(int i=0;i<num;i++)
        {
        	fact=fact*(i+1);
        }
        scan.close();
        System.out.println("The factorial of " +num+ " is "+fact);
	}

}
