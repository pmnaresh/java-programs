package com.tostring;

public class WithToStringMethod {
	int num;
	String name;
	String city;
	long mobilenumber;
	
	

	public static void main(String[] args) {
		WithToStringMethod s1 = new WithToStringMethod(123, "nari", "ncnsfbh", 15755878);
		
		WithToStringMethod s2 = new WithToStringMethod(123, "nari", "ncnsfbh", 15755878);
		
		System.out.println(s1);
		System.out.println(s2);

	}



	public WithToStringMethod(int num, String name, String city, long mobilenumber) {
		super();
		this.num = num;
		this.name = name;
		this.city = city;
		this.mobilenumber = mobilenumber;
	}



	@Override
	public String toString() {
		return "WithToStringMethod [num=" + num + ", name=" + name + ", city=" + city + ", mobilenumber=" + mobilenumber
				+ "]";
	}
	

}
