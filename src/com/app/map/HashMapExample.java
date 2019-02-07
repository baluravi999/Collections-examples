package com.app.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		for(Entry<Integer, String> m1:map.entrySet()){
			System.out.println( m1.getKey()+"  "+ m1.getValue());
			
		}
		Set<Integer> key=map.keySet();
		Collection<String> val=map.values();
		for(String st:val){
			System.out.println(st);
		}for(Integer intt:key){
			System.out.println(intt);
		}
		
	}

}
