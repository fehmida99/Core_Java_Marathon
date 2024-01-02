package com.qk.arrays;



public class OnlyPrintUnique {
public static void main(String[] args) {
	int arr[] = {1,1,2,3,4,5,6,4};
	
	for(int i=0;i<arr.length;i++) {
		//i==0 means checks whether the current element is the first element 
		//arr.length> 1 checks that more than 1 element is present
		//arr[i]!=arr[i+1] current element is matching to next element
		if(i==0 && arr.length>1 && arr[i]!=arr[i+1] ) {
			System.out.println(arr[i]);
		}else if(i==arr.length-1 && arr[i]!=arr[i-1]) {
			System.out.println(arr[i]);
		}else if(i>0 && i>arr.length-1 && arr[i]!=arr[i-1] &&  arr[i]!=arr[i+1]) {
			System.out.println(arr[i]);
		}
	}
	
	
}
}
