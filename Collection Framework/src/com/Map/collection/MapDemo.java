package com.Map.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
public static void main(String[] args) {
	//for adding the element in the map we have to use put instead of add.
	Map<Integer, String> map = new HashMap<>();
	map.put(01,"Fehmida");
	map.put(02, null);
	map.put(03, "sana");
	map.put(null, "aliya");
	
	
//	map.clear();
	
//	System.out.println(map.containsKey(03));
//	System.out.println(map.containsValue("Fehmida"));
//	System.out.println(map.get(03));
	
//	map.remove(03);
	
	map.replace(03, "arshi");
	
	System.out.println( map.size()); 
	System.out.println(map);
	//Adding element in arraylist:
//	ArrayList<Integer> al = new ArrayList<>();
//	al.add(1);
//	al.add(2);
//	
//	System.out.println(al);
	
	
	
	
}
}
