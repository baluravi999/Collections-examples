package com.app.conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysToList {

	public static void main(String[] args) {
		
		String[] s={"a","b","a","b","c","d"};
		System.out.println(s);
	      
	       
	       List<String> list=new ArrayList<String>();
	      Collections.addAll(list, s);
	      System.out.println(list.size());
	      Set<String> ss1=new HashSet<String>(list);//adding list obj to set obj
	      System.out.println(ss1);
	       Set<String> set=new HashSet<String>(Arrays.asList(s));
	       for(String ss:set){
		    	  System.out.print(ss+" ");
		       }System.out.println();
	      Collections.addAll(set, s);
	       for(String ls:list){
	    	   System.out.print(ls+" ");
	    	  }System.out.println();
	      for(String ss:set){
	    	  System.out.print(ss+" ");
	       }System.out.println();
		List<String> list2=new ArrayList<String>();
		list2.addAll(list);
		for(String s3:list2){
			System.out.print(s3);
		}
	}
}
