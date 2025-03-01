package com.pakage;

public class Assendingorder {

	public static void main(String[] args) {
		int[] ar = new int[] {6,1,2,3,4,5,7,8};
		int temp =0;
		System.out.println("elemets of original array");
		for (int i=0; i<ar.length;i++) {
			System.out.print(ar[i] +" ");
		}
		for (int i=0;i<ar.length;i++) {
			for (int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]){
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
					
					
				}
			}
		}
		System.out.println();
		System.out.println("after sorting");
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] +" ");
		}

	}

}
