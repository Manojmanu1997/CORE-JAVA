package com.Heraizen.cj.day1;

public class AlpabaticPattern1 {
	public static void main(String[] args) {
        int alphabet = 65;
        for (int i = 0; i< 3; i++)
{
    for (int j = 0; j < 3; j++)
    {
        System.out.print((char) alphabet + " ");
        alphabet++;
    }
    
    System.out.println();
}
	}
}
