package com.app.main;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Pragadee";
		
		System.out.println(s.toCharArray());
		
		
		char[] ch=s.toCharArray();
		
	
		
		for (int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		
		for (int  i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		StringBuffer str= new StringBuffer("Kumar");
		StringBuffer str1= new StringBuffer();
		str1.append("Saravana");
		System.out.println(" "+str.reverse());
		System.out.println(str1.reverse());
	}

}
