package com.ty.learnjava17.oops.encapsulation;

class Book {

	private String title;
	private String author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Bookdetails : title =" + title + "Author=" + author + "]";
	}

}

public class Driverclass {

	public static void main(String[] args) {

		Book book1 = new Book("Adventures of Tom Sawyer", " Mark Twain");
		Book book2 = new Book("Agni Veena", "Kazi Nasrul Islam");
		Book book3 = new Book("Animal Farm", "George Orwell");
		Book book4 = new Book("Ben Hur", "Lewis Wallace");

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);

	}

}
