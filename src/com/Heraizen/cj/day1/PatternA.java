package com.Heraizen.cj.day1;

public class PatternA {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4;j++) {
				if((i==2 &&(j==2 || j==3)) || (i==4 &&(j==2 || j==3)) || (i==5 &&(j==2 || j==3))) {
				System.out.print("  ");
			}
				else
					System.out.print("@ ");	
				}
			System.out.println();
			
		}
		

	}

}
