package com.Heraizen.cj.array;
import static java.lang.System.out;
import static com.Heraizen.cj.array.BigOrSmallArray.big;
import static com.Heraizen.cj.array.BigOrSmallArray.small;
import static com.Heraizen.cj.array.SumOfArray.add;
import java.util.Scanner;
public class Day3Task {
	public static void main(String[] args) 
    {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter no. of elements you want in array:");
	        int n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	        }
	        out.println("Sum of Element is : "+add(a));
	        out.println("Biggest Element is : "+big(a));
	        out.println("Smallest Element is : "+small(a));
		s.close();
    }
}
