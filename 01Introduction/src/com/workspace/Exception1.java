package com.workspace;

//import java.util.Scanner;
//
//public class Exception1 {
//
//	

//	public class NameNotSupportedException extends RuntimeException{
//		
//		public NameNotSupportedException() {
//			
//		}
//		
//		public NameNotSupportedException(String message) {
//			super(message);
//		}
//		
//		public NameNotSupportedException(String message, Throwable cause)
//		{
//			super(message, cause);
//		}
//
//	}
//	public class ExceptionTest {
//
//		public static void main(String[] args){
//	             anIntermediateMethod();
//		}
//		
//		public static void anIntermediateMethod() {
//
//			System.out.println("Name is : " + nameReader());
//			System.out.println("Age is : " + ageReader());
//		}
//		
//	public static String nameReader() throws NameNotSupportedException{
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter a candidate name");
//			String name = sc.next();
//			if (name.contains("@")) {
//				NameNotSupportedException obj = new NameNotSupportedException("Name should not have special characters"); 
//				throw obj;
//			}
//			return name;
//		}
//	guru dharshan7:02 AM
//	public static int ageReader() {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter candidate age");
//			int age = sc.nextInt();		
//			return age;
//		}