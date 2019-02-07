package com.app.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee(10,"a");
		Employee e2=new Employee(40,"A");
		Employee e3=new Employee(30,"B");
		list.add(e1);
		list.add(e2);
;       list.add(e3);
 System.out.println("sorting by id");
Collections.sort(list, new EidComp());

//System.out.println(list);
  for(Employee e:list){
	  System.out.println(e.eid+" "+e.ename);
  }System.out.println("sorting by names");
  Collections.sort(list, new EnameComp());
    for(Employee ee1:list){
    	 System.out.println(ee1.eid+" "+ee1.ename);
    }
    
	}
	
}
