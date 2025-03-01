package com.methodoverloading;

public class Test {

	public static void main(String[] args) {
		ByChangingNumberOfParameters method = new ByChangingNumberOfParameters();
		method.methodone();
		method.methodone(528);
		method.methodone(1235, 1578);
		method.methodone(152, 15263, 48795);
	}

}
