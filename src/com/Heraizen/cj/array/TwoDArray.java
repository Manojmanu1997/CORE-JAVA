package com.Heraizen.cj.array;
import static com.Heraizen.cj.array.FunctionsOf2D.*;
import static java.lang.System.out;
import java.util.*;
public class TwoDArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 out.print("Enter number of rows in a matrix:");
	     int row = s.nextInt();
	     out.print("Enter number of columns in a matrix:");
	     int col = s.nextInt();
         int a[][] = new int[row][col];
	     out.println("Enter all the elements of a matrix:");
         for (int i = 0; i < row; i++) 
         {
             for (int j = 0; j < col; j++) 
             {
                 a[i][j] = s.nextInt();
             }
         }
         out.println("Sum of Element is : "+add(a));
         out.println("Biggest of Element is : "+big(a));
         out.println("Sum of Diagonal Element is : "+addDiagonal(a));
         out.println("transpose of Matrix is : ");
         int b[][] = new int[col][row];
    	 for(int i = 0; i < a.length; i++)
         {
    		 for(int j=0;j < a.length; j++) {
             b[i][j] = a[j][i];
             out.print(b[i][j]+" ");    
    		 }    
    		 out.println();
         
         }
         s.close();
	}
}
