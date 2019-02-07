package com.app.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterator {


	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
	Iterator<Map.Entry<Integer,String>> itr=map.entrySet().iterator();
	
	while(itr.hasNext()){
	Map.Entry<Integer, String> e =itr.next();
		System.out.println(e.getKey()+" "+e.getValue());
		
	}
	
}
}