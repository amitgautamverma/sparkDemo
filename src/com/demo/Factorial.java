package com.demo;

public class Factorial {

	
	public static int fact(int n) {
		if(n<=1) {
			return 1;
		}
		while(n>1){
		return n*fact(n-1);
		}
		return n;
	}
	
	public static void main(String aer[]) {
		int n=0;
		System.out.println(fact(n));
	}
}
