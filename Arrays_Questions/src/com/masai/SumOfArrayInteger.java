package com.masai;
//Write a Java program to find the sum of all elements in an integer array.
public class SumOfArrayInteger {
	 public static void main(String[] args) {
	        // System.out.println("Hello, World!");
	        
	        int[] arr = {2,4,4,6,6,1,5};
	        
	        int sum =0;
	        for(int i=0;i<arr.length;i++){
	            sum+=arr[i];
	        }
	        System.out.println(sum);
	        
	        
	    }
}
