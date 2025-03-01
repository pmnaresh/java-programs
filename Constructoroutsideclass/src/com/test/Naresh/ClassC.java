package com.test.Naresh;

public class ClassC  extends ClassB{
	public void wildAnimal() {
		System.out.println("wild animal Name is Navven Batthala");
	}
	public static void main(String[] args) {
		ClassB b = new ClassC();
		b.Animal();
		b.dog();
		
		ClassC c= new ClassC();
		c.Animal();
		c.dog();
		c.wildAnimal();
	}

}
