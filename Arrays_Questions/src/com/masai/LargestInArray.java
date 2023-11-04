package com.masai;

public class LargestInArray {
public static void main(String[] args) {
	
	int arr[] = {1,2,3,3,6,7,9};
	
	int max = arr[0];
//	int min = arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
//			if(arr[i]<min) {
//			min = arr[i];
//		}
	}
	System.out.println("Maximum value is :"+ max);
//	System.out.println("Minimum value is :"+ min);
	}
}
