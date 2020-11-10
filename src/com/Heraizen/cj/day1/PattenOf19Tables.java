package com.Heraizen.cj.day1;

public class PattenOf19Tables {
	public static void main(String[] args) {
        int number = 19;
        for (int i = 0; i< 3; i++)
{
    for (int j = 0; j < 3; j++)
    {
        System.out.print(number + " ");
        number=number+19;
    }
    
    System.out.println();
}
	}

}
