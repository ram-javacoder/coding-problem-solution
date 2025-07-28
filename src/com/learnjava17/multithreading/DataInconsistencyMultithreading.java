package com.learnjava17.multithreading;

class SharedResource {

	static StringBuilder story = new StringBuilder(
			"The StringBuilder class in Java is used to create mutable, or changeable, strings of characters. The StringBuilder class acts as a replacement for the String Class in Java. It creates a mutable sequence of characters instead of an immutable one as the String Class does.\r\n"
					+ "StringBuilder is a thread-safe class. It is synchronized, which means that its methods are thread-safe and can be safely used in a multithreaded environment.\r\n"
					+ "StringBuilder is faster than the String Class for sufficiently large strings concatenation. This is because StringBuilder does not create a new object each time the string is modified. Instead, it simply modifies the existing object.\r\n"
					+ "StringBuilder is also more memory-efficient than the String Class. This is because StringBuilder does not create a new object each time the string is modified. Instead, it simply modifies the existing object.");

}

class Reader extends Thread {

	public void read() {

		for (int i = 0; i < SharedResource.story.length(); i++) {

			System.out.println("Read :" + SharedResource.story.charAt(i));
		}
	}

	@Override
	public void run() {
		read();
	}

	public Reader(String name) {
		super(name);
	}

}

class Writter implements Runnable {

	public void write() {

		for (int i = 0; i < SharedResource.story.length(); i++) {

			SharedResource.story.replace(i, i + 1, i + "X");
		}

	}

	@Override
	public void run() {

		write();

	}

}

public class DataInconsistencyMultithreading {

	public static void main(String[] args) {

		System.out.println("main () start!");

		Thread reader = new Reader("reader");
		Thread writter = new Thread(new Writter(), "writter");
		reader.start();
		writter.start();

		System.out.println("--> " + SharedResource.story + " <---");
		System.out.println("main() end");

	}

}
