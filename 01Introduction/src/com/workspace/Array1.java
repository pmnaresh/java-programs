package com.workspace;

public class Array1 {
	public static void main(String[] args) {

//		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
//		for (int i : array) {
//			System.out.println(i);
//		}
		String Str[]= {"naresh","kumar","pavankalyan","Ram charan","Powerstar"};
		for(String string:Str)
		{
			System.out.println(string);
		}
		boolean[] boo= {true,false,true,false};
		for (boolean ba:boo) {
			System.out.println(ba);
		}
		for(String string1:Str) {
			if (string1.equals("Ram charan")) {
				System.out.println("Hi " +string1);
			}
		}
	}
}