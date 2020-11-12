package com.Heraizen.cj.day1;

import java.util.Scanner;

public class ContinueStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n= sc.nextInt();
		int i, j; 

        for(i=1; i<=n; i++)
		{
			
			for(j=1; j<=n; j++)
			{
				if(i!=j)
				{
					System.out.println(i+" "+j);
				}
			}
		}

        sc.close();
	}

}
