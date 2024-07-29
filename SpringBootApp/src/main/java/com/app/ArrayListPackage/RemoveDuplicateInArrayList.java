package com.app.ArrayListPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInArrayList {

	public static void main(String[] args) {
		
		
		

		ArrayList<String> list= new ArrayList<String>();
		
		
		list.add("Eclipse");
		list.add("Visual studio Code");
		
		list.add("IntellJ");
		list.add("Eclipse");
		
		System.out.println(list);
		
		Set<String> set= new HashSet<String>(list);//convert list to set and also remove duplicate
		
		System.out.println(set);

	}

}
