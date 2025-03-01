package com.workspace;

public class Method1 {

public static void main(String[] args) {
	String str="java";
	String str1="Naresh";
	String str2=new String (new char[] {'N','A','R','E','S','H'});
		char c = str2.charAt(0);
		System.out.println(c);
		System.out.println(str.hashCode());
		System.out.println(str1.equals(str1));
		System.out.println(str1.toUpperCase());
}
}