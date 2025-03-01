
package com.pakage;

public class BankMain {
	public static void main(String[] args) {
		RBI rbi= new Canara();
		System.out.println(rbi.homeloan(100000, 5));
		System.out.println(rbi.carloan(200000, 12));
		System.out.println(rbi.buisinessloan(300000, 25));
		
	}

}
