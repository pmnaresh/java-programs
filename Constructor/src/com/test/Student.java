package com.test;

public class Student {
	
	public Student() {
		System.out.println("i am in defalut constructor");
	}
	public Student(int id) {
		System.out.println("with single parameter");
	}
	public Student(int id ,String name) {
		System.out.println("with two parameters");
		
	}
	public Student(String name,int id) {
		System.out.println("with parameters exchange");
	}
	public Student(int id ,String name,String address) {
		System.out.println("with three parameters");
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
//		System.out.println(s1);
		Student s2=new Student(101);
//		System.out.println(s2);
		Student s3=new Student(101,"Naresh");
//		System.out.println(s3);
		Student s4= new Student("Naresh",101);
//		System.out.println(s4);
		Student s5=new Student(101,"Naresh","Adress");
//		System.out.println(s5);
		
	}

}
