package com.app.conversion;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String[] s={"a","b","c","d","e"};
		
		//arrays to arraylist conversion
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		System.out.println(al);
		al.add("ravi");
		al.add("kishore");
		for(String s1:al){
			System.out.println(s1);
		}
		// arraylist to array conversion
		 String[] ss=al.toArray(s);
		 System.out.println(ss);
		 for(String sss:ss){
			 System.out.print(sss+"  ");
		 }
		
	}

}
