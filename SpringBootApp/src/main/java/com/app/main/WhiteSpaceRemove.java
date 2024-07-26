package com.app.main;

public class WhiteSpaceRemove {

	public static void main(String[] args) {
		
		String s=" We will meet success ";
		
		
		System.out.println(s.replaceAll("\\s+", ""));

		
		
		System.out.println("s: "+s.replaceAll("\\s", ""));
		
		
		
		char[] arr=s.toCharArray();
		
		//System.out.println(" char arr: "+arr.toString());
		
		String without="";
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				
				 without=without+arr[i];
			}
		}
		System.out.println("without using builtin method:"+without);
		
	}

}
