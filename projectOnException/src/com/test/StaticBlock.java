package com.test;

public class StaticBlock {
	static int i =52;
	int j=20;
	static {
		System.out.println("static block 1");
		System.out.println(i);
		
	}
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}
	{
		System.out.println(j);
		System.out.println("instance block 1");
	}
	public void add() {
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		StaticBlock sb=new StaticBlock();
		sb.add();
		System.out.println("main method ");
		
		



	}

}
