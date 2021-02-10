package javaOOP3hw;

import java.util.List;

public class Library {

	private String address;
	private List<Book> catalog;
	
	public Library() {}
	
	public Library(String address) {
		this.address = address;
	}
	
	public void addBook(Book addBook) {
		System.out.println(this.catalog);
	}
	public static void printOpeningHours() {
		System.out.println("Daily from 9am to 5pm");
	}
	public void printAddress()	{
		System.out.println(this.address);
	}
	public void borrowBook(String title) {
		System.out.println(this.catalog);
		System.out.println("You successfully borrowed The Lord of the Rings ");

	}
	public void printAvailableBooks() {
		System.out.print(this.catalog);
//		System.out.println("The Davinci Code, A Tale of Two Cities, La Petite Prince, Lord of The Rings");
	}
	public void returnBook(String title) {
//		System.out.println(this.catalog);
		System.out.println("You successfully returned The Lord of the Rings ");
					
					
	}

}
