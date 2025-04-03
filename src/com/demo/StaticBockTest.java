package com.demo;

public class StaticBockTest {

	StaticBockTest(){
		
		System.out.println("constructor call");
	}
	
	public void get() {
		
		System.out.println("method call");

	}
	
	{
		
		System.out.println("instance block call");

	}
	
	
	static {
		System.out.println("static block call");

	}
	public static void main(String[] args) {
		
		System.out.println("hello ");

		
		new StaticBockTest().get();
		

	}

}
