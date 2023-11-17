package com.qk.arrays;

public class MinElement {
	public static void main(String[] args) {

		int arr[] = { 4, 3, 2, 1 ,-10,-5};

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
             if(arr[i]<min) {
            	 min=arr[i];
             }
		}
         System.out.println(min);
	}
}
