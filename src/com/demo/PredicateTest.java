package com.demo;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		SumTest sum = (a, b) -> a + b;
		System.out.println(sum.getSum(10, 20));
	

	Predicate<Integer> gt=a->(a>10);
	Predicate<Integer> ls=a->(a<10);

	System.out.println(gt.and(ls).test(5));
	System.out.println(gt.or(ls).test(5));

}

@FunctionalInterface
interface SumTest {

	public int getSum(int a, int b);
}
}
