package com.workspace;

public class Method {
	 
	public static String getString(String str) {
		String result = str.toLowerCase();
		
		return result;
	}
	public static void main(String[] args) {
		Method method = new Method();
		System.out.println(getString("Naresh"));
	}
	
}