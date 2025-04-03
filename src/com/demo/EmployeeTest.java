package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void print(String str) {
		System.out.println("string print "+str);
	}
	
	public static void print(Object obj) {
		System.out.println("object print "+obj);
	}
	
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("vikas", 2000,"HR"));
		list.add(new Employee("puneet", 2100,"HR"));
		list.add(new Employee("dhani", 2500,"IT"));
		list.add(new Employee("rohit", 2000,"TEST"));
		list.add(new Employee("chndra", 2500,"IT"));
		
		
		Map<Employee, Integer> map = new HashMap<>();
		map.put(new Employee("varun"),100);
		map.put(new Employee("pooja"),900);
		map.put(new Employee("pooja"),200);
		//System.out.print(map.size());   
		//System.out.print(map.get(new Employee("varun")));   
		//System.out.print(map.get(new Employee("pooja"))); //postConstruct  //@Conditional

		Optional<Employee>employee=list.stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed())
		.limit(1).findFirst();
		
		Map<String, Optional<Employee>>employee2=list.stream().collect(
				Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSal))));
				
	//	System.out.print(employee);
		System.out.println(employee2);

	//	print("amit");
	//	print(12);
	}

}
