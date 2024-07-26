package com.app.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		
		
		//String[] s1= {"Monday","Tuesday","wednesday","Thursday","Friday"};
		//String[] s2= {"Tuesday","Monday","wednesday","Friday","Thursday"};
		
		String[] s1= {"1","2","3","4"};
		String[] s2= {"2","5","4","7"};
		
		//ArrayList<String> list= new ArrayList<String>();
		
		HashSet<String> set= new HashSet<String>();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					
					set.add(s1[i]);
					//list.add(s1[i]);
				}
			}
		}
		
		System.out.println(set);
		
		
		String[] s3= {"1","2","3","4"};
		String[] s4= {"2","5","4","7"};
		
	    ArrayList<String> list1=new ArrayList<String>(Arrays.asList(s3));
	    ArrayList<String> list2=new ArrayList<String>(Arrays.asList(s4));
		
		
	    HashSet<String> str1=new HashSet((Arrays.asList(s3)));
	   HashSet<String> str2=new HashSet((Arrays.asList(s4)));
		
	    
		System.out.println(list1.retainAll(list2));
		
		System.out.println(str1.retainAll(str2));
		System.out.println("Intersection of arrays: "+str1);
		
		
	
	}

}
