package com.demo;

public class Fabonicci {

	
	public static int getFab(int n) {
		if(n<=1) {
			return n;
		}
		
	return getFab(n-1)+getFab(n-2);
		
	}
	public static void main(String[] args) {
		int n=10;
	for(int i=0;i<n;i++) {
		
		System.out.println(getFab(i));
	}

	}

}
