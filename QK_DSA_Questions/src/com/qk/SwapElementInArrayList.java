package com.qk;

import java.util.ArrayList;
import java.util.List;

//Swap using Collections:
//Write a Java program to swap two elements in an ArrayList.


public class SwapElementInArrayList {
public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<>();
	list.add(5);
	list.add(10);
	list.add(20);
	list.add(15);
	list.add(16);
	list.add(18);
	
	
	System.out.println(list);
	
//	list.get(2);
//	list.set(2, 5);
//	
//	list.get(0);
//	list.set(0, 20);
//	System.out.println();
//	System.out.println(list);

	
	int val1 = list.get(0);
	int val2 = list.get(1);
	
	list.set(1, val1);
	list.set(0, val2);
	
	System.out.println(list);
	
}
}
