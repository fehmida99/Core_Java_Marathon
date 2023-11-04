package com.masai;
//Write a program to count the number of even and odd elements in an array of integers.

public class Count_Even_Odd {
public static void main(String[] args) {
	int arr[]= {1,2,4,5,6,3,8,9,0};
	
	int evenCount = 0;
	int oddCount = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			evenCount++;
		}else {
			oddCount++;
		}
	}
	System.out.println("Total Even Numbers are :"+evenCount);
	System.out.println("Total Odd Numbers are :"+oddCount);
	
}
}
