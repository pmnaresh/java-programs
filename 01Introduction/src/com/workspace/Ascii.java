package com.workspace;

public class Ascii {
	public static void main(String[] args) { 
		Ascii dis= new Ascii();
		int[] value=dis.check("Suresh");
		for(int result:value) {
			System.out.println(result);
		}
	   
	    
	    
	   
	}
	public int[] check (String name) {
		int[] ch = new int[name.length()];
		for(int i=0;i<name.length();i++) {
		 ch[i]=name.charAt(i);
			
		}
		return ch;
		
	}
	}


