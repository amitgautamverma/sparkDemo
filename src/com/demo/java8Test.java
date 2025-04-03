package com.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class java8Test {

	
	public static void main(String ar[]) {
		
		
		TestInterface sum=(a,b)->a+b;
		
		//System.out.println(sum.add(10, 1));
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6,2,4);
		 //filter even numbers
		// numbers.stream().filter(a->a%2==0).forEach(System.out::println);
		 
		 //print squar of the numbers
		// numbers.stream().map(a->a*a).forEach(System.out::println);
		 
		 //print max value
//		int max=	numbers.stream().max(Comparator.comparingInt(a->a)).get();
//		 System.out.println(max);
		 
		 
		// to count and print the number of elements in a list
		 
//		long count= numbers.stream().count();
//		 System.out.println(count);
		 
		 //sum of all interger
//		 long total= numbers.stream().reduce(0,Integer::sum);;;
//		 System.out.println(total);
//		 
		 
		 
	        List<String> words = Arrays.asList("Java", "Python", "JavaScript");
	        
	        //print string length
	       // words.stream().map(a->a.length()).forEach(System.out::println);


	        //to print distinct elements from a list of integers
	        
	       // numbers.stream().distinct().forEach(System.out::println);
	        
	        List<String> words2 = Arrays.asList("a", "bb", "ccc", "dd");
	        Map<Integer, List<String>> grouped = words2.stream().collect(Collectors.groupingBy(String::length));
	
	        System.out.println(grouped);
	}
}

