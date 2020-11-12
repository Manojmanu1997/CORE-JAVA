package com.Heraizen.cj.array;

public class SumOfArray {

    public static int add(int[] a ) 
    {
    	int sum=0;
    	 for(int i = 0; i < a.length; i++)
         {
             sum = sum + a[i];
         }
    	return sum;
        }
    public static int avg(int[] a ) 
    {
    	int sum=0;
    	 for(int i = 0; i < a.length; i++)
         {
             sum = sum + a[i];
         }
    	 int avg=sum/a.length;
    	return avg;
        }
}