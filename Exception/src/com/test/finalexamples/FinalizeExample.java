package com.test.finalexamples;

public class FinalizeExample {

	public static void main(String[] args) {
		FinalizeExample fe=new FinalizeExample();
		System.out.println("hashcode is :"+fe.hashCode());
		fe=null;
		System.gc();
		System.out.println("end of garbage collector");
	}
	protected void finalize() {
		System.out.println("called the finalize method");
	}

}
