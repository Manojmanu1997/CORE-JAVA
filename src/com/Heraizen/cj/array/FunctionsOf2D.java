package com.Heraizen.cj.array;

public class FunctionsOf2D {
	 public static int add(int[][] a ) 
	    {
	    	int sum=0;
	    	 for(int i = 0; i < a.length; i++)
	         {
	    		 for(int j=0;j < a.length; j++) {
	             sum = sum + a[i][j];
	         }
	         }
	    	return sum;
	        }
	 public static int big(int[][] a ) 
	    {
	    	int max=a[0][0];
	    	for(int i=0;i<a.length;i++) {
	    		for(int j=0;j < a.length; j++) {
	    		if(max < a[i][j]) {
	    			max=a[i][j];
	    		}}
	    	}
	    	return max;
	        }
	 public static int addDiagonal(int[][] a ) 
	    {
	    	int sum=0;
	    	 for(int i = 0; i < a.length; i++)
	         {
	    		 for(int j=0;j < a.length; j++) {
	         if(i==j) {
	    			 sum = sum + a[i][j];
	         }}
	         }
	    	return sum;
	        }
	 
	}
