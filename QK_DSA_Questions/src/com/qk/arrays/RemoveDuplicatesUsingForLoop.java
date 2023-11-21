package com.qk.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingForLoop {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4,4,5,3,7,8,6};
		RemoveDuplicates(arr);
	}
	
	
	public static void RemoveDuplicates(int arr[]) {
		Set<Integer> set = new LinkedHashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
		
	}
	
	
	

}
