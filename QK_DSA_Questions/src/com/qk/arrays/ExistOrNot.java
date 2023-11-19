package com.qk.arrays;
//Create a program to check if a given element exists in an array.

public class ExistOrNot {
	public static void main(String[] args) {

		int arr[] = { 8, 9, 4, 3, 2, 7 };
		int target = 42;

	   String flag = "No";
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]==target) {
			   	flag = "Yes";
			   	break;
		   }
	   }
		System.out.println(flag);
		
		
		
}
}