package com.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo {

	private int id;

	public static void main(String ar[]) {

		String str = "AmitVerma";
//str.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(a -> a, Collectors.counting()))
		// .entrySet().stream().filter(m -> m.getValue() ==
		// 1).forEach(System.out::println);

		Map<Character, Integer> map = new LinkedHashMap<>();

		char[] arr = str.toLowerCase().toCharArray();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);

			} else {
				map.put(arr[i], 1);

			}
		}
		
		for(Entry en:map.entrySet()) {
			
			if((int)en.getValue()==1) {
				System.out.println(en.getKey());
				break;
			}
		}
		
		
	}
}
