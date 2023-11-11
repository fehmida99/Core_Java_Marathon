package com.qk;

public class SwappingWithoutTemp {
public static void main(String[] args) {
	
	int x = 5;
	int y =10;
	
	x=x+y;  //10+20=30
	y=x-y;  //30-20=10    y=10
	x=x-y;   //30-10=20   x=20
	
	
	System.out.println("Values after swapping : "+ "X value = "+x+" , Y value = "+y);
	
	
	
}

}
