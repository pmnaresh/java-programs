package com.pakage;

public class KumarMain {
	public static void main(String[] args) {
		
		Naresh obj = new Naresh();
		obj.setContactNumber(990869);
		obj.setEmail("naresh@gmail.com");
		obj.setGender("Male");
		obj.setId(101);
		obj.setName("Naresh");
		System.out.println(obj.getEmail());
		System.out.println(obj.getContactNumber());
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getGender());
		
		
	}

}
