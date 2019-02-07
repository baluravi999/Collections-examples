package com.app.product;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Product> list=new ArrayList();
		
		list.add(new Product(10,"airtel",100));
		list.add(new Product(20,"idea",200));
		list.add(new Product(30,"jio",300));
		list.add(new Product(40,"Voda",400));
		List<Double> priceList=new ArrayList<Double>();
		for(Product pr:list){
			if(pr.getPrdctSal()>200){
				priceList.add(pr.prdctSal);
				System.out.println(pr.getPrdctId()+"------"+pr.getPrdcName()+"-----"+pr.getPrdctSal());
			}
		}System.out.println(priceList);
		for(Double d:priceList){
			System.out.println(d.doubleValue());
		}
		

	}

}
