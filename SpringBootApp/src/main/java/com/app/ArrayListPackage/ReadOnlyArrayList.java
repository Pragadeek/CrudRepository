package com.app.ArrayListPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReadOnlyArrayList {

	public static void main(String[] args) {


		
		ArrayList<String> list= new ArrayList<String>();
		list.add("java");
		list.add("Python");
		list.add("c");
		list.add("C++");
		list.add("ReactJs");
		
		System.out.println(list);
		
	Collection<String> c=	Collections.unmodifiableCollection(list);
		
		c.add("ll");
		
	//List<String> unmodified=	Collections.unmodifiableList(list);
		
	
	
	//System.out.println("Unmodified: "+unmodified);
		
	//	unmodified.add("Angular");
		
		System.out.println(list);
	}

}
