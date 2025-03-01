package com.string;

public class Stringobject {

	

	public static void main(String[] args) {
		
		char[] ch = {'j','a','v','a','N','A'};
		
		String str = new String (ch);
		System.out.println(str);
		
		String str1 = "my name is nareshkumar";
		for(int i= str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		for (int i=0;i<str1.length();i++) {
			System.out.println(str1.codePointAt(i));
		}
		System.out.println(str1.hashCode());
		
		

	}

}
