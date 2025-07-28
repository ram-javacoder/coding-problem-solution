package com.learnjava17.java8programming.consumerfunctioninterface;

import java.util.function.Consumer;

public class PrintUsingConsumer {

	public static void main(String[] args) {
		
		Consumer<String> printString=p -> System.out.println(p);
		printString.accept("Ram");
		printString.accept("Mohanavel");
		printString.accept("Poongavanam");
		printString.accept("Lakshmanakumar");
		printString.accept("Lokesh");
		
		
	}
	
}
