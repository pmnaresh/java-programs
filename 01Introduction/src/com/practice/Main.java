package com.practice;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> names =Arrays.asList("Naresh","Apple","Raj");
		names.stream().forEach(System.out::println);
		System.out.println("*****");
		names.stream().filter(name->name.startsWith("N")).forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		numbers.stream().map(num->num*num).forEach(System.out::println);
		
		String str = "Naresh";
		for(int i=str.length()-1 ;i>=0;i--) {
			System.out.println(str.charAt(i));
			
			
		}

	}

}
