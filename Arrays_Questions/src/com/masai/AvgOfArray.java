package com.masai;
//Given an array of integers, find the average of all elements.

public class AvgOfArray {
public static void main(String[] args) {
	
	int[] arr = {1,4,5};
	
	int sum=0;
	int count =0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
		count++;
	}
	System.out.println(sum/count);
	
}
}
