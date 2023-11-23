package com.qk.arrays;

public class Swapping {
public static void main(String[] args) {
	int arr[]= {9,4,5,3,4,5,7,8,9};
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[i]) {       //4<9
				int temp = arr[j];   //4
				arr[j]=arr[i];    //9
				arr[i]=temp;       //4
				
			}
		}
		System.out.print(arr[i]+" ");
		
		
	}
	
	
	
}
}
