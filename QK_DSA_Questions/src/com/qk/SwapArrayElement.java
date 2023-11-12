package com.qk;

import java.util.Arrays;

/*please explain Swap Array Elements:
Write a Java program to swap the first and last elements of an integer array.*/

public class SwapArrayElement {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

//        int temp =arr[0];      //1
//        arr[0] = arr[arr.length-1];      //5
//        arr[arr.length-1]=temp;  //1
//        
//        System.out.println(Arrays.toString(arr));
        
          for(int i=0;i<arr.length;i++) {
        	  int temp = arr[0];
        	  arr[0] = arr[arr.length-1];
        	  arr[arr.length-1] = temp;
        	  
        	  System.out.print(arr[i]+" ");
        	  
          }
		
		
		
		
		
	}
}
