package com.stringbuilder;

public class Employee {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Naresh ");
		
		sb.trimToSize();
		System.out.println(sb);
		sb.append("Kumar");
		sb.reverse();
		sb.charAt(1);
		sb.delete(0, 5);
		System.out.println(sb);
	}

}
