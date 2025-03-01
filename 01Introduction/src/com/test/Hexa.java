package com.test;

public class Hexa {
	public int[] HexaNumberCreator(int number) {
		int[] hexa = new int[10];
		int i=0;
		int hex =0;
		while(number>0) {
			hex=number%16;
			hexa[i]=hex;
			i++;
			number=number/16;
			
	
				
			}
		return hexa;
	
	
	
	}
	
	}


