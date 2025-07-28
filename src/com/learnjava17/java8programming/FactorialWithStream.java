package com.learnjava17.java8programming;

import java.util.stream.LongStream;

public class FactorialWithStream {

	public static long factorial(long n) {
        return LongStream.rangeClosed(1, n)
                        .reduce(1, (x, y) -> x * y);
    }

    public static void main(String[] args) {
        int number = 5; // Example number
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
	
}
