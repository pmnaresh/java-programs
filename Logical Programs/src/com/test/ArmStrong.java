package com.test;

public class ArmStrong {

	public static void main(String[] args) {
		int num=153;
		int res=0;
		int sum=0;
		int temp=num;
		while(num>0) {
			res=num%10;
			num=num/10;
			sum=sum+res*res*res;
			
		}
		if(temp==sum) {
			System.out.println(temp +" is a armstrong");
			
		}
		else {
			System.out.println(temp +" is not a armstrong");
		}

	}

}
