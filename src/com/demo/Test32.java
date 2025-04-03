package com.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test32 {

	public static void main(String[] args) {
		int[] ar1 = { 1, 2, 3, 4, 9, 8, 9, 8, 8 };
		
		Map<String,String> hashMap=new HashMap<>();
		hashMap.put("ram", "demo1");
		hashMap.put("ram2", "demo2");
System.out.println("All map is");
		hashMap.entrySet().stream().forEach(System.out::println);

		System.out.println("filter map is");
		hashMap.entrySet().stream().filter(a->a.getValue().equals("demo1")).map(a->a.getKey()).forEach(System.out::println);


		
		List<int[]> list = Arrays.asList(ar1);

		list.stream().collect(Collectors.groupingBy(a -> a, Collectors.counting())).entrySet().stream()
				.filter(a -> a.getValue() ==2).forEach(System.out::print);
		
		Map<Integer,Integer> map=new HashMap();
		
		for(int i=0;i<ar1.length;i++) {
			
			if(map.containsKey(ar1[i])) {
				
				map.put(ar1[i], map.get(ar1[i])+1);
			}else {
				map.put(ar1[i], 1);
			}
			
		}
		
		for(Entry en:map.entrySet()) {
			
			if((int)en.getValue()==2) {
				
			//	System.out.println(en.getKey());
				
			}
			
		}

	}

}
