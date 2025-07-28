package com.ty.learnjava17.objectclass;

class Book {

	int bid;
	double price;

	public Book() {
		super();
	}

	public Book(int bid, double price) {
		super();
		this.bid = bid;
		this.price = price;
	}

	@Override
	public boolean equals(Object ref) {

		Book b = new Book();

		if (this.bid == b.bid && this.price == b.price) {
			return true;
		} else {

			return false;
		}

	}

}

public class EqualsBookOperation {

	public static void main(String[] args) {

		Object b1 = new Book(1, 125);
		Object b2 = new Book(2, 234);

		if (b1.equals(b2)) {
			System.out.println("States are same!...");
		} else {

			System.out.println("States are Diffrent!...");
		}

		if (b1.equals(b1)) {

			System.out.println("States are Same!...");
		} else {

			System.out.println("States are diffent!...");
		}

		Book b = new Book();

		System.out.println(b.equals(null));

	}

}

/*
 * States are Diffrent!... States are Same!...
 */