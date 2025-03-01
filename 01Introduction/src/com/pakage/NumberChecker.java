package com.pakage;

public class NumberChecker {
	public boolean Pollindrome(int num) {
		int r,sum=0;
		
		while(num>0){    
			   r=num%10;    
			   sum=(sum*10)+r;    
			   num=num/10;
		}
		return true;
		
	}
	public boolean armstrong(int num) {
int r,sum=0;
		
		while(num>0){    
			   r=num%10;    
			   sum=(sum*10)+r*r*r;    
			   num=num/10;
		}
		return true;
		
	}
	public boolean perfectnumber(int num) {
		
		return true;
		
	}
	public boolean primenumber(int num) {
		if (num <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i < num; i++) {  
	           if (num % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
		
	}
	public boolean evenodd(int num) {
		if (num%2==0) {
			return true;
			
		}
		
		return false;
		
	}

}
