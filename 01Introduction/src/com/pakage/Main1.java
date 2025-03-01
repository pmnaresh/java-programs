package com.pakage;

public class Main1 {

	public static void main(String[] args) {
		String s="python";
		String str="java";
		String str1=str.intern();
		
		System.out.println(str1==str);
		
		System.out.println(str.equals(str));
		
		System.out.println(str.hashCode());
		
		System.out.println(str1.hashCode());
		
		System.out.println(s.hashCode());
		
		System.out.println(str1);
		
		System.out.println(str1);
		
		

	}

}
