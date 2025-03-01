package com.test;

public class HexaMain {

	public static void main(String[] args) {
		Hexa obj = new Hexa();
	int[] result =	obj.HexaNumberCreator(78);
	for(int i = result.length-1;i>=0;i--) {
		System.out.print(result[i]);
	}

	}

}
