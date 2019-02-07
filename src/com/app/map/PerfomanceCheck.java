
package com.app.map;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerfomanceCheck {
 public static void main(String[] args) {
	
	
	 ArrayList<String> a=new ArrayList<String>();//access level good(index), right shift will perform when modify inserting data
	 a.add("a");
	 a.add("b");
	 a.add("c");
	 a.add("d");
	 System.out.println(a.size());
	System.out.println(a); 
	a.add(2, "r");
	System.out.println(a);
	a.remove(1);
	System.out.println(a);
	LinkedList<String> lk=new LinkedList<String>();//nodes level isertion , modification perpose good
	lk.add("a");
	lk.add("c");
	lk.add(1, "b");
	System.out.println(lk);
}
}
