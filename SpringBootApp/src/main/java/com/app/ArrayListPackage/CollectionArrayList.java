package com.app.ArrayListPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionArrayList {

	public static void main(String[] args) {
	

		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		//list.add(null);
		list.add(" ");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		Iterator itr=list.iterator();
		
		System.out.println(list.size());
		for (int i=0;i<list.size();i++) {
		
		System.out.println(itr.next());
		}

		
	
	}

}
