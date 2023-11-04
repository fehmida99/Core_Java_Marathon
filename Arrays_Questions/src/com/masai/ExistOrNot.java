package com.masai;

import java.util.Arrays;

//Create a program to check if a given element exists in an array.

public class ExistOrNot {
	public static void check(int[] arr,int ToSearchVal) {
		 boolean find = false;
		 
		 for(int element:arr) {
			 if(element == ToSearchVal) {
				 find = true;
				 break;
			 }
		 }
		 System.out.println("The element " + ToSearchVal + " exist or not? "+find);
	}
	
	
	
public static void main(String[] args) {
	int arr[]= {1,2,4,5,6,3,18,9,0};
	int ToSearchVal = 6;
	
	System.out.println(Arrays.toString(arr));
	System.out.println();
	 check(arr,ToSearchVal) ;
	  
	  
	  
	  
	  
}
}
