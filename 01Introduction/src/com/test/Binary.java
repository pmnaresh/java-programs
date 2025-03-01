package com.test;

public class Binary {
	public int[] binarynumber(int number) {
		int [] binary = new int[10];
		int i =0;
		int bin = 0;
		while(number>0) {
			bin=number%2;
			binary[i]=bin;
			i++;
			number=number/2;
					
		}
		return binary;
		
	}

	public static void main(String[] args) {
		Binary obj = new Binary();
	int[] result=	obj.binarynumber(25);
	for (int i =result.length-1;i>=0;i--) {
		System.out.print(result[i]);
	}
	}

}
