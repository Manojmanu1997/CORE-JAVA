package com.Heraizen.cj.array;

public class BigOrSmallArray {

    public static int big(int[] a ) 
    {
    	int max=a[0];
    	for(int i=1;i<a.length;i++) {
    		if(max < a[i]) {
    			max=a[i];
    		}
    	}
    	return max;
        }
    public static int small(int[] a ) 
    {
    	int min=a[0];
    	for(int i=1;i<a.length;i++) {
    		if(min > a[i]) {
    			min=a[i];
    		}
    	}
    	return min;
        }
    
}