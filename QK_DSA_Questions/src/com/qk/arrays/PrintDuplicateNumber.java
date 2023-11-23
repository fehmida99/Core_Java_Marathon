package com.qk.arrays;

import java.util.Arrays;

//Algorithm:
/*1. sort the array   
 *2.run a for loop till arr.length-1
 *3.compare 1st and next element
 *4.print arr[i] 
 * */




public class PrintDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 1, 1, 3, 5,5 ,9,9};

		Arrays.sort(arr);

		//1st Method
//		for (int i = 0; i < arr.length-1 ; i++) {
//			if (arr[i] == arr[i + 1]) {
//				System.out.print(arr[i]+" ");
//			}
//
//		}
		
		//2nd method to take care of last element:
		for (int i = 0; i < arr.length ; i++) {
		if(i<arr.length-1 && arr[i]==arr[i+1]) {
			System.out.print(arr[i]+" ");
		}
		}
	}
}
