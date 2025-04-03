package com.demo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatTest {

	public static void main(String[] args) {
		String s = "aabccd";
		
		
Optional<Entry<Character, Long>>	map=	s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(c->c.getValue()==1).findFirst();

System.out.print(map);
	}

}


