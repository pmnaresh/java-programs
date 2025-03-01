package com.exception;

import java.util.Scanner;

public class Throw {
	
	
	
	public static void main(String[] args) {
		anintermediate();
		
		
	}
	public static  void anintermediate () {
		System.out.println("Name is :"+nameReader());
		System.out.println("Age is : "+ageReader());
		
	}
	public static String nameReader() throws NotFoundException{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a name :");
		String name =sc.next();
		try {
			if(name.contains("@")) {
				throw new NotFoundException("Name shuld not contain the special characters like @,#,%,!,_ ");
			}
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("please enter a new  valid name : ");
			name = sc.next();
			
			
		}
		
		
		return name;
		
	}
	public static int ageReader() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age :");
		int age = sc.nextInt();
		try {
		if(age<=18) {
			throw new NotFoundException("if age is less than 18 then you are not eligible for voting");
		}}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("please enter age grater than 18 then only you are eligible for voting");
			age=sc.nextInt();
			
			
		}
		
		return age;
		
	}

}
