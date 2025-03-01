package com.stringbuffer;

public class Student {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Naresh");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.replace(0, 3,"Nareshkumar      ");
		System.out.println(sb);
		sb.capacity();
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb);
	}

}
