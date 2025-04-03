package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test12 {

	public static void main(String[] args) {
		Sum t = (a, b) -> a + b;

		// System.out.print(t.sum(1, 2));
		Map<String,Integer> map=new HashMap<>();
		 map.put("ram",100);
		 map.put("amit",200);
		 map.put("ram",100);
			System.out.println(map.size());   
			 map.put("ram",300);
				System.out.println(map.size());   


	}

}

@FunctionalInterface
interface Sum {

	public int sum(int a, int b);
}
