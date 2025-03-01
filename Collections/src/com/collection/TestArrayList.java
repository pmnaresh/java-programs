package com.collection;

import java.util.ArrayList;


public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		for(int i=1;i<=100;i++) {
			arraylist.add(i);
		}

		ArrayList even = evennumber(arraylist);
		System.out.println(even);
		ArrayList odd = oddnumber(arraylist);
		System.out.println(odd);
		
	}
	
	private static  ArrayList evennumber(ArrayList arraylist) {
		ArrayList evenlist=new ArrayList();
		for(int i=0;i<arraylist.size();i++) {
			if(((Integer)arraylist.get(i))%2==0) {
				evenlist.add(arraylist.get(i));
			}
		}
		return evenlist;
	
	
	}
	public static ArrayList oddnumber(ArrayList arraylist) {
		ArrayList oddlist=new ArrayList();
		for(int i=0;i<arraylist.size();i++) {
			if(((Integer)arraylist.get(i))%2!=0){
				oddlist.add(arraylist.get(i));
			}
		}
		return oddlist;
		
	}

}
