package com.qk;

public class BubbleSort {
public static void main(String[] args) {
	
	int arr[]= {3,1,6,2};
	
	System.out.println("Sorted Array :");
	for(int i=0;i<arr.length;i++) {
		for(int j=1;j<arr.length-i;j++) {
			if(arr[j-1]>arr[j]) {    //3>1 true arr[j-1]=3,    arr[j] = 1
				int temp = arr[j];    //1
				arr[j]=arr[j-1];     //3
				arr[j-1] = temp;   //1
//				System.out.println(arr[i]);
			}
		}
		System.out.print(arr[i]+ " ");
	}
	
	
	
	
}


}
