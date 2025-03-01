package com.methodoverloading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ByChangingDataType main = new ByChangingDataType();
		main.methodone();
		System.out.println(main.methodone(12.5f, 15.25f));
		System.out.println(main.methodone(12, 52));

	}

}
