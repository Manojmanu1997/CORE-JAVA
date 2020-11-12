package com.Heraizen.cj.day1;
import java.util.Scanner;

/***
 * 
 *  Write a program to accept the weight of 3 persons,
 *  calculate the total weight, determine the average weight and display these details.
 * 
 * @author Manoj
 *
 */

public class AvarageOfWeights {
	 public static void main(String args[]){
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the weight of the first person: ");
	       float person1 = sc.nextFloat();
	       
	       System.out.println("Enter the weight of the second person: ");
	       float person2 = sc.nextFloat();
	       
	       System.out.println("Enter the weight of the third person: ");
	       float person3 = sc.nextFloat();
	       
	       sc.close();
	       float sum = person1 + person2 + person3;
	       float Avg = sum/3;
	       System.out.println("The sum of weight of the 3 persons is " + sum + " Kgs and the average weight is " + Avg + " Kgs");

		 
	 }

}
