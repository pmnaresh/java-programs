package com.test;

public class withThrows {
	public void add() throws Exception {
		System.out.println("iam in add method");
		add1();
	}
	public void add1() throws Exception {
		System.out.println("iam in add1 method");
		add2();
		
	}
	public void add2() throws Exception {
		System.out.println("i am in add2 method");
		throw new Exception("exception occur");
	}

	public static void main(String[] args) {
		
		withThrows wt=new withThrows();
		try {
			wt.add();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("iam handled the exception");
		}

	}

}
