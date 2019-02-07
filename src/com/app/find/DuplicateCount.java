package com.app.find;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCount {

	public static void main(String[] args) {
		 String s= "java programing";
		 //using collection find duplicate elements count
		 System.out.println(s.length());
		char[] c= s.toCharArray();
		Character ch=null;
		 Set<Character> set=new HashSet<Character>();
		 for(int i=0;i<=c.length-1;i++){
			ch =new Character(c[i]);
			 System.out.println(); 
		 }
		 set.add(ch);
		 for(Character ss:set){
		 System.out.println(ss);
			 
		// }
		 

	}

	}}
