package com.qk.Hashmap.Questions;

import java.util.HashMap;

public class CreateEmptyMap {
public static void main(String[] args) {
	
	HashMap<Integer, String> hm = new HashMap<>();
	
	hm.put(1, "Fehmida");
	hm.put(2, "Heena");
	hm.put(3, "Aaliya");
	
	System.out.println(hm);
	
	//Using entrySet
	System.out.println("The set is : "+" "+hm.entrySet());
	
}
}
