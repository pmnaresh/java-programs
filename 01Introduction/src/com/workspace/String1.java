package com.workspace;

public class String1 {
	public static void main(String[] args) {
		String s= "Nareshkumar";
		System.out.println(s);
		System.out.println(s.charAt(5));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String s1= s.toUpperCase();
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s));
		System.out.println(s1.codePointAt(8));
		System.out.println(s1.hashCode());
		System.out.println(s1.length());
		System.out.println(s1.concat(s));
		System.out.println(s1.toString());
		
		
		System.out.println("____________________________________");
		
		
		String str1="  sachin";
		String str2= "  tendulkar";
		System.out.println(str1);
		System.out.println(str1.trim());
		System.out.println(str1.concat(str2));
		System.out.println(str1.startsWith(" "));
		System.out.println(str1.endsWith("r"));
		System.out.println(str1.length());
		System.out.println(str1.lastIndexOf(str2));
		
		
		System.out.println("_____________________________________________");
		
		
		
		
		
		
	}
	
	
	
	

}
