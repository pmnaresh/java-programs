package com.pakage;

public class WrapperClass {
	public static void main(String[] args) {
		int i =10;
		Integer abc= new Integer(i);
		System.out.println(abc.byteValue()); //retuns number
		System.out.println(abc.compareTo(9));//if number=anothernumber prints 0,if number < anothernumber given numer prints -1 ,
												//	if num>anothernumber prints 1
		System.out.println(abc.doubleValue());	// returns double value
		
		float f =5.5f;
		Float cba=new Float(f);
		System.out.println(abc.equals(cba));//comparas the objects values
		System.out.println(abc.floatValue());//converts to float value
		System.out.println(abc.hashCode('p'));//returns hashcodes
		System.out.println(abc.toString('n'));//asci code
		System.out.println(abc.max(10,20));
		
	}

}
;