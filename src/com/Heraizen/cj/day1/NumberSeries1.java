package com.Heraizen.cj.day1;
import java.util.*;
public class NumberSeries1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter the number: ");
		num=scan.nextInt();
	    System.out.print("The series is:");
	    System.out.print("1");
        for(int i=1;i<num;i++)
        {
        	System.out.print("+"+1+"/"+(i+1) );
        }
        scan.close();
	}
}
