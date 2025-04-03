package com.demo;

 class B{ 



public void sayHi(){
 System.out.println("Inside B"); 
 } }

  public class A extends B{ 
 
public void sayHi(){ 
 System.out.println("Inside A");
 }
 public static void main(String args[]){
 B b = new A(); 

 b.sayHi(); 
 } }