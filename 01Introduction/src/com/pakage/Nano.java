package com.pakage;

public  class Nano extends Abstract {

	public static void main(String[] args) {
		Nano obj = new Nano();
		obj.performance();
		obj.running();
		obj.look();
		obj.model();
		
	}
	@Override
	public void performance() {
		System.out.println("Hi how are you");
		
	}

	@Override
	public void running() {
		System.out.println("hi how do you doo");
		
	}
	@Override
	public void look() {
		// TODO Auto-generated method stub
		super.look();
	}

}
