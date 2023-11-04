package com.masai;

public class RotateArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
	    int k = 2; // Number of positions to rotate

	    int n = arr.length;
	    int[] rotatedArray = new int[n];

	    for (int i = 0; i < n; i++) {
	        int newPosition = (i + k) % n;
	        rotatedArray[newPosition] = arr[i];
	    }

	    // Print the rotated array
	    for (int i = 0; i < n; i++) {
	        System.out.print(rotatedArray[i] + " ");
	    }
	}
	
}
