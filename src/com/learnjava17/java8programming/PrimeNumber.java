package com.learnjava17.java8programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(11,12,13,14,15,16,17,18);
		System.out.println("List of Prime Numbers: ");
		findingPrimenumber(numbers).forEach(System.out::println);
		
	}

	private static List<Integer> findingPrimenumber(List<Integer> numbers) {

		return numbers.stream().filter(p -> isPrime(p)).collect(Collectors.toList()); //filter(PrimeNumber :: isPrime)

	}

	public static boolean isPrime(int number) {
	        return number > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(number))
	                .noneMatch(i -> number % i == 0);

	        
	        
}
}
