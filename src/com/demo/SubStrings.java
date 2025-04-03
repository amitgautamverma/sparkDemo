package com.demo;

public class SubStrings {

	
	public static void getSubString(String str) {
		
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
			System.out.println(str.substring(i, j));
			}
			
		}
	}

public static void main(String ar[]) {
	String str="amit";

	getSubString(str);
}
}
