package com.qk.arrays;

public class MaxElement {
	public static void main(String[] args) {

		int arr[] = { 1, 4, 7, 8, 3, 6, 1000 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {     //1>0
            	max=arr[i];
            }
		}
		System.out.println(max);

	}
}
