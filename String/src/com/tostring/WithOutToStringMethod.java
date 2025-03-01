package com.tostring;

public class WithOutToStringMethod {
	int num;
	String name;
	String city;
	

	public WithOutToStringMethod(int num, String name, String city) {
		
		this.num = num;
		this.name = name;
		this.city = city;
	}


	public static void main(String[] args) {
		WithOutToStringMethod s1= new WithOutToStringMethod(12, "Naresh", "badanapalle");
		WithOutToStringMethod s2 = new WithOutToStringMethod(15,"suresh","ddfer");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
