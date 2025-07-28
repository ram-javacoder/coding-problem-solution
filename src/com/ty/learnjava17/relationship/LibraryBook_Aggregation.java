package com.ty.learnjava17.relationship;

import java.util.ArrayList;
import java.util.List;

class Book {

	private String title;

	Book() {

		super();
	}

	Book(String title) {

		this.title = title;

	}

	public String getTitle() {

		return this.title;

	}

}

class Library {

	private List<Book> books;

	Library() {

		this.books = new ArrayList<>();

	}

	public void addBook(Book book) {
		books.add(book);

	}

	public void showBook() {

		for (Book b : books) {

			System.out.println("Title of Book :" +b.getTitle());
		}

	}
}

public class LibraryBook_Aggregation {

	public static void main(String[] args) {

		Book b1 = new Book("Java Programming");
		Book b2 = new Book("Data Structure");

		Library l = new Library();
		l.addBook(b1);
		l.addBook(b2);

		l.showBook();

	}

}
