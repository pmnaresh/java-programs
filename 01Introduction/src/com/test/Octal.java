package com.test;

public class Octal {
	public int[] octalnumber(int number) {
		int [] octal = new int[10];
		int i =0;
		int bin = 0;
		while(number>0) {
			bin=number%8;
			octal[i]=bin;
			i++;
			number=number/8;
					
		}
		return octal;
		
	}

	public static void main(String[] args) {
		Octal obj = new Octal();
	int[] result=	obj.octalnumber(151);
	for (int i =result.length-1;i>=0;i--) {
		System.out.print(result[i]);
	}
	}

}
//0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f
