package com.app.main;

import java.util.Arrays;

public class TwoArraysEqual {

	public static void main(String[] args) {
		
		
		int [] arr1= {1,2,3,4,5};
		int[] arr2= {1,5,3,4,2};
		
		boolean equalorNot=false;
		
		//System.out.println(Arrays.equals(arr1, arr2));
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[1]==arr2[1]) {
					equalorNot=true;
				}
			}
			
		}else {
			equalorNot=false;
		}
		if(equalorNot) {
			System.out.println("both are same");
		}
		else {
			System.out.println("both are diff");
		}
		
	}

}
