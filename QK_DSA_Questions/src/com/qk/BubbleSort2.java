package com.qk;

public class BubbleSort2 {
public static void main(String[] args) {
	int[] arr = {4,3,1,2};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[i]) {     //3<4
				int temp=0;
				temp = arr[j];    //3
				arr[j]=arr[i];       //4
				arr[i] = temp;
				
			}
			
		}
		System.out.println(arr[i]);
	}
	
	
	
	
	
	
	
	
}
}
