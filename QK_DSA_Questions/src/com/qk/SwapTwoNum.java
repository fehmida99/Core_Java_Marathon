package com.qk;

public class SwapTwoNum {
public static void main(String[] args) {
	
	//Swap Two Numbers:
	//Write a Java program to swap the values of two variables without using a temporary variable.
	
	/*STEP 1: START
	STEP 2: ENTER x, y
	STEP 3: PRINT x, y
	STEP 4: x = x + y
	STEP 5: y= x - y
	STEP 6: x =x - y
	STEP 7: PRINT x, y
	STEP 8: END*/
	
	
	int a = 20;
	int b = 10;
	
	 a = a+b;  //20+10= 30;
	 b = a-b ; //30-10=20;
	 a =a-b ;   //30-20=10
	
	System.out.println("a = "+a+ ", b = "+b);
	
	
	
}
}
