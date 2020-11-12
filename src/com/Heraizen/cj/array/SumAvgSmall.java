package com.Heraizen.cj.array;

public class SumAvgSmall {
	 public static int small(int[] a ) 
	    {
	    	int min=a[0];
	    	for(int i=0;i<a.length-3;i++) {
	    		if(min > a[i]) {
	    			min=a[i];
	    		}
	    	}
	    	return min;
	        }
	 public static int add(int[] a ) 
	    {
	    	int sum=0;
	    	 for(int i = 0; i < a.length-3; i++)
	         {
	             sum = sum + a[i];
	         }
	    	return sum;
	        }
	    public static int avg(int[] a ) 
	    {
	    	int sum=0;
	    	 for(int i = 0; i < a.length-3; i++)
	         {
	             sum = sum + a[i];
	         }
	    	 int avg=sum/(a.length-3);
	    	return avg;
	        }
}
