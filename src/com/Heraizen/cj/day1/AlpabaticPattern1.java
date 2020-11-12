package com.Heraizen.cj.day1;

/***
 * 
 * Write a program to generate alphabet patterns.
 * 
 * @author Manoj
 *
 */

public class AlpabaticPattern1 {
	public static void main(String[] args) {
        int alphabet = 65; // ASCII Value of A is 65
        for (int i = 0; i< 3; i++)
{
    for (int j = 0; j < 3; j++)
    {
        System.out.print((char) alphabet + " "); // Here alphabet value converting to char
        alphabet++;
    }
    
    System.out.println();
}
	}
}
