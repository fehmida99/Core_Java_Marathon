package com.qk.arrays;

import java.util.Arrays;

public class OnlyUnique {
public static void main(String[] args) {
	
	int arr[] = {1,1,2,2,3,5,6,4};
	Arrays.sort(arr);     //11223456
	
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]!=arr[i+1]) {
			System.out.println(arr[i]);
		}
	}
	
	if(arr[arr.length-2]!=arr[arr.length-1]) {
		System.out.println(arr[arr.length-1]);
	}
	
	
	
}
}
