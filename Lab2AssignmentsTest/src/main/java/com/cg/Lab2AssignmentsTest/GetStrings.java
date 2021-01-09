
/**
 * Create a method which accepts an integer array,
 *  reverse the numbers in the array and returns the resulting array in sorted order
 *   
 *
 */
package com.cg.Lab2AssignmentsTest;
import java.util.Arrays;
public class GetStrings {
      public static void main(String[] args) {
		int array[]= {20,50,80,90,100};

		getSorted(array);
	}

	public static void getSorted(int array[]) {

	   System.out.println("Ori Array:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	    System.out.println("Reverse Array:");

		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]+" ");
		}

	    Arrays.sort(array);
	    for(int i=0;i<array.length;i++)
	    {
	    	System.out.print(array[i]+" ");
	    }

	}

}

