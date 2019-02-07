package com.app.operator;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		Map<Integer,String> hashmap=new HashMap<Integer,String>();
		hashmap.put(i1, "ravi");
		hashmap.put(i2, "kishore");
		System.out.println(hashmap);
		Set<Integer> key=hashmap.keySet();
		System.out.println(key);
		for(Integer e:key){
			System.out.println(e);
		}
		IdentityHashMap<Integer,String> id=new IdentityHashMap<Integer,String>();
		id.put(i1,"ravi");
		id.put(i2, "kishore");
		System.out.println(id);
		
		// equals() to identify the duplicate keys
		if(i1.equals(i2)){
			System.out.println("using Equals() keys are equal");
		}else
			System.out.println("using Equals() keys are not equals");

	if(i1==i2){
		System.out.println("using == operator id keys are equal");
		
	}else
		System.out.println("usiing == operator id keys are not equal");
	}

}
