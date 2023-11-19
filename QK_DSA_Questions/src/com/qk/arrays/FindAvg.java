package com.qk.arrays;

public class FindAvg {
	public static void main(String[] args) {

		int arr[] = { 2, 1, 4, 5, 6 };

		int sum = 0;

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			sum += arr[i];

		}
//	System.out.println(sum);
		System.out.println("Average is : " + sum / n);

	}
}

