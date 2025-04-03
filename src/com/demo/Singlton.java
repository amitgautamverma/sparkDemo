package com.demo;

public class Singlton {

	
	public static Singlton testObj=null;
	
	
	private Singlton() {
		
	}
	
	public static Singlton getObject() {
		
		if(testObj==null) {
			synchronized (Singlton.class) {
				if(testObj==null) {
				return new 	Singlton();
			}
			}
		
		}
		return testObj;
		
	}
}
