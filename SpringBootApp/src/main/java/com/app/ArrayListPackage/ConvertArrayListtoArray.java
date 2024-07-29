package com.app.ArrayListPackage;

import java.util.ArrayList;

public class ConvertArrayListtoArray {

	public static void main(String[] args) {
	
		
		
		ArrayList<String> list= new ArrayList<String>();
		
		
		list.add("Eclipse");
		list.add("Visual studio Code");
		
		list.add("IntellJ");
		
		System.out.println(list);
		
		Object[]  obj=list.toArray();
		
		for (Object o:obj) {
			System.out.println("Convert List to array :"+o);
		}
		
		
	
		
		

	}

}
