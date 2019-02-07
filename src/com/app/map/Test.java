package com.app.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		Map map=new LinkedHashMap();
		map.put(10, "a");
		map.put(20, "b");
		map.put(30, "c");
		System.out.println(map);
		Set s=map.keySet();
		System.out.println(s);
		Collection s1=map.values();
		System.out.println(s1);
		
		Set e=map.entrySet();
		System.out.println(e);
		Iterator ci=e.iterator();
		while(ci.hasNext()){
			Map.Entry m=(Map.Entry)ci.next();
			System.out.println(m.getKey()+  ".."+m.getValue());
		}
		
		
	}
	
}
