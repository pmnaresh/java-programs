package com.pakage;

public  class Canara implements RBI {
	@Override
	public double homeloan(int principle ,int time) {
		float intrestrate = 6.3f;
		double totalintrest = (principle*time*intrestrate)/100 ;
		System.out.println(totalintrest+" is the intrest home loan in canara bank ");
		return totalintrest;
	}
	@Override
	public double carloan(int principle ,int time) {
		float intrestrate = 8.0f;
		double totalintrest = (principle*time*intrestrate)/100 ;
		System.out.println(totalintrest+"is the intrest car loan in canara bank");
		return totalintrest;
	}
	@Override
	public double buisinessloan(int principle ,int time) {
		float intrestrate = 5.0f;
		double totalintrest = (principle*time*intrestrate)/100 ;
		System.out.println(totalintrest +"is the intrest business loan in canara bank");
		return totalintrest;
	}
	
	

}
