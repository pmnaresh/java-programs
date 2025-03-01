package com.test;

public class InstanceBlock {
	int i=10;
	int j=0;
	{
		System.out.println("instance block 1");
	}
	{
		System.out.println("instance block 2");
	}
	{
		System.out.println("instance block 3");
	}
	public void add() {
		System.out.println("add method");
		try {
		System.out.println(i/j);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		InstanceBlock ib = new InstanceBlock();
		ib.add();
		System.out.println("after main method ");
		System.out.println("in the main method");
	}

}
