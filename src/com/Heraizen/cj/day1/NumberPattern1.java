package com.Heraizen.cj.day1;

public class NumberPattern1 {

	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=4;i++) {
			for (int j=1;j<i+1;j++) {
				
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}

}
