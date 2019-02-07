package com.app.comparator;

import java.util.Comparator;

public class EidComp implements Comparator< Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		/*if(e1.eid==e2.eid){
			return 0;
			
		}
		else if(e1.eid>e2.eid){
			return 1;
		}else{
			return -1;
			}*/
		return e1.eid-e2.eid;
		
	}
	
	

}
