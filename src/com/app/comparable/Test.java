package com.app.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Student s1=new Student(10,"b","ece");
		Student s2=new Student (20,"a","csc");
		Student s3=new Student(13,"c","mech");
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);
		System.out.println(list);
		for(Student s:list){
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSadd());
		}
		

	}

}
