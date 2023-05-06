package com.qk.Hashmap.Questions;

import java.util.HashMap;

public class ImplementHashMapFromScratch {
public static void main(String[] args) {
	
	
	HashMap<Integer, String> hm = new HashMap<>();
	hm.put(1, "Fehmida");
	hm.put(2, "In");
	hm.put(3, "The");
	hm.put(4, "Kitchen");
	
	System.out.println(hm);
	
	
	
	System.out.println(hm.get(2));
	//System.out.println(hm.remove(3));
	System.out.println(hm);
	System.out.println(hm.containsValue("Fehmida"));
	System.out.println(hm.containsKey(6));
	System.out.println(hm.clone());
	System.out.println(hm.equals(hm));
	System.out.println(hm.hashCode());
	System.out.println(hm.isEmpty());
	System.out.println();
	System.out.println(hm.put(5, "Youtube"));
	System.out.println(hm.putIfAbsent(6, "channel"));
	System.out.println(hm.size());
	System.out.println(hm);
	System.out.println(hm.entrySet());
	System.out.println(hm.replace(6, "Channell"));
	System.out.println(hm);
	System.out.println(hm.toString());
	System.out.println(hm);
	
	
	
	
	
	
	
}
}
