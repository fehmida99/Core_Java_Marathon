package com.masai;
//Create a program to find the smallest element in an array of integers.

public class SmallestElement {
public static void main(String[] args) {
	int arr[] = {10,20,80,30,-1};
	
	int min = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min =  arr[i];
		}
	}
	System.out.println("Smallest number is : "+min);
	
}
}
