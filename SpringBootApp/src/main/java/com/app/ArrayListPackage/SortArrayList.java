package com.app.ArrayListPackage;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("SBI");
		list.add("IOB");
		list.add("ICICI");
		list.add("HDFC");
		list.add("BOB");
		
		System.out.println("without sort: "+list);
		
		Collections.sort(list);  //by default it will be ascending 
		
		System.out.println("Ascending order: "+list);
		
		
		Collections.sort(list,  Collections.reverseOrder());
		
		System.out.println("decending order: "+list);
		
		
		

	}

}
