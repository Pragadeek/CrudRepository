package com.app.CollectionPackages;

import java.util.ArrayList;

public class CollectionArrayList {

	public static void main(String[] args) {
	

		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Grapes");
		list.add("Grapes");
		System.out.println(list);
		
		
		Object[] s =list.toArray();
		
		

	}

}
