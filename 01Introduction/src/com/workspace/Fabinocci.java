package com.workspace;

public class Fabinocci {
	private int n1=0;
	private int n2=1;
	private int n3=0;

	public static void main(String[] args) {
		Fabinocci fabi = new Fabinocci();
		System.out.println(fabi.addnumber(10));
		

	}
	public int  addnumber(int num) {
		for (int i=2;i<num;i++) {
			
			if(num>0) {
				
				n1=n2;
				n2=n3;
				n3=n1+n2;
				System.out.print(","+ n3 );
			}
		
	}
		return n3;

	}
}