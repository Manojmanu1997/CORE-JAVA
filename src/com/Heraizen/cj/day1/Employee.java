package com.Heraizen.cj.day1;
import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		 
	       Scanner sc = new Scanner(System.in);
	       String name;
	       System.out.println("Enter the empno: ");
	       int empno = sc.nextInt();
	      sc.nextLine();
	       System.out.println("Enter the employee name: ");
	       name = sc.nextLine();
	       
	       System.out.println("Enter the monthly salary: ");
	       int salary = sc.nextInt();
	       sc.close();
	       int yearsalary=salary*12;
	       System.out.println("Hi " + name +"! Your employee id is "+empno+", monthly salary is Rs " +salary+" and yearly salary is Rs "+yearsalary+".");
	    
	}

}
