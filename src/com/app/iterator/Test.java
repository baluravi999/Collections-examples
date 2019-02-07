package com.app.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List list=new LinkedList();
		for(int i=0;i<=10;i++){
			list.add(i);  //[012345678910]
		}
		
		list.add(9);
		//list.add("a");
		System.out.print(list);
  Iterator<Integer> itr=list.iterator();
  while(itr.hasNext()){
	Integer n= itr.next();
	  if(n%2==0){
		  System.out.println(n);
	  }else
		  itr.remove();
	  
  }
  System.out.print(list);
	}

}
