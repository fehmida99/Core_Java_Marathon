package com.qk.arrays;

public class Swapping_element {
	public static void main(String[] args) {

		int arr[] = {5,3,4,5,4,6,5,2,1,2,8,7};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {   //5<3
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			System.out.println(arr[i]);
		}
		
		
	}
}
