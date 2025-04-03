package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FilterString {

	public static void main(String[] args) {
		

		System.out.println("filter map is");

String s="amit";
		
		List<String> list = new ArrayList();
		list.add("1111");
		list.add("2222");
		list.add("Amit");

		list.stream().filter(a->a.chars().allMatch(Character::isDigit)!=true).forEach(System.out::println);;
		
		
		}

	

}
