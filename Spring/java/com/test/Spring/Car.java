package com.test.Spring;

public class Car   {
	
	private int tyres;
	
	
	public int getTyres() {
		return tyres;


	}

	public void setTyres(int tyres) {
		this.tyres = tyres;
	}


	public void drive() {
		System.out.println("Hello"+tyres);
		
	}

}
