package com.workspace;

public class Array {

//	public void display() {
//		char CharArray[] = new char[8];
//		CharArray[0] = 'N';
//		CharArray[1] = 'A';
//		CharArray[2] = 'R';
//		CharArray[3] = 'E';
//		CharArray[4] = 'S';
//		CharArray[5] = 'H';
//		CharArray[6] = ' ';
//		CharArray[7] = 'K';
//
//		System.out.println(CharArray);
//		for (char c : CharArray) {
//			System.out.println(c);
//		}
//
//	}
	
	public char[] display() {
		char[] chararray = new char[3];
		chararray[0] = 'N';
		chararray[1] = ' ';
		chararray[2] = 'K';
		for (char c : chararray) {

			System.out.println(c);

		}

		return chararray;

	}

}
