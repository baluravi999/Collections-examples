package com.app.performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		LinkedList list2=new LinkedList();
		//arraylist performance adding elements
		long start1=System.nanoTime();
		for(int i=0;i<100;i++){
			list1.add(i);
		}

		long end1=System.currentTimeMillis();
		System.out.println("Arraylist "+(end1-start1));//
		//Linked list Performnce adding elements
		long start2=System.currentTimeMillis();
		for(int i=0;i<100;i++){
			list2.add(i);
		}

		long end2=System.nanoTime();
		System.out.println("LinkedLIst "+(end2-start2));
	}

}
