package com.Heraizen.cj.day1;
import java.util.Scanner;
public class AvarageOfWeights {
	 public static void main(String args[]){
		 float person1, person2, person3, sum, Avg;
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the weight of the first person: ");
	       person1 = sc.nextFloat();
	       
	       System.out.println("Enter the weight of the second person: ");
	       person2 = sc.nextFloat();
	       
	       System.out.println("Enter the weight of the third person: ");
	       person3 = sc.nextFloat();
	       
	       sc.close();
	       sum = person1 + person2 + person3;
	       Avg = sum/3;
	       System.out.println("The sum of weight of the 3 persons is " + sum + " Kgs and the average weight is " + Avg + " Kgs");

		 
	 }

}
