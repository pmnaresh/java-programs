package com.pakage;

public class Asci {
	public static void main(String[] args) {
		Asci asci=new Asci();
		char[] result =asci.sample(new int[] {97,98,99,100});
		for (char c :result) {
			System.out.println(c);
			
		}
			
		}
		
	public char[] sample (int[] num ) {
		char[] ch=new char[num.length];
		for(int i=0;i<num.length;i++) {
			ch[i]=(char)num[i];
		}
		return ch;
	
		
	}
}