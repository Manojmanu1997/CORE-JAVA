package com.Heraizen.cj.array;
import static com.Heraizen.cj.array.SumAvgSmall.*;
import static java.lang.System.out;
public class SumAvgSmallest {

	public static void main(String[] args) {
		int[] arr = {3,2,4,5,6,4,5,7,3,2,3,4,7,2,0,0,0};
		out.println("Sum of Element is : "+add(arr));
		out.println("Avg of Element is : "+avg(arr));
		out.println("Smallest of Element is : "+small(arr));
		arr[14]=add(arr);
		arr[15]=avg(arr);
		arr[16]=small(arr);
		out.print("[ ");
		for(int i=0;i< arr.length;i++) {
			out.print(arr[i]+" ");
		}
		out.print("]");
	}

}
