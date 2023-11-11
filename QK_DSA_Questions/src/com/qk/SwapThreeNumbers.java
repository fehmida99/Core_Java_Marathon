package com.qk;
/*Swap Three Numbers:
Extend the previous program to swap the values of three variables cyclically (i.e., A to B, B to C, C to A).*/

public class SwapThreeNumbers {
public static void main(String[] args) {
	
	int x =5;
	int y=10;
	int z=15;
	
	x = x+y+z;  //30
	y = x-y-z;   //30-10=20-15 =5
	z = x-y-z;    //30-5-15      =10
	x = x-y-z;     //30-5-10     =15
	
	
	System.out.println("After Swapping : "+" x = "+x+", y = "+y+", z = "+z);
	
}
}
