package com.naresh.threadhandling;

import java.util.Scanner;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
		
		
	}

	

}
