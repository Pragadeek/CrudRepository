package com.app.ArrayListPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedList {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		
		
	List<String>list1=	Collections.synchronizedList(list);
	
	synchronized (list1) {
		
	Iterator<String>	itr=list1.iterator();
	
	while (itr.hasNext()) {
		
		System.out.println( itr.next());
		
		
	}
		
	}

	}

}
