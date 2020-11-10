package com.Heraizen.cj.day1;

public class patternI {
	public static void main(String[] args) {
	for(int i=0;i<7;i++) {
		for(int j=0;j<9;j++) {
			if(i==0 || j==4 || i==6) {
			System.out.print("* ");
		}
			else
				System.out.print("  ");	
			}
		System.out.println();
		
	}
	}

}
