package com.methodoverloading;

public class ByChangingDataType {
	
	public int methodone(int a ,int b) {
		return a+b;
	}
	public float methodone(float a, float b) {
		return a+b;
		
	}
	public void methodone() {
		System.out.println("im a defauly method");
	}

}
