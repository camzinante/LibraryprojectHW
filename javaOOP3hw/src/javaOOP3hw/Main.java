package javaOOP3hw;

public class Main {

  public static void main(String[] args) {
 
    Library firstLibrary = new Library("10 Main St.");
    Library secondLibrary = new Library("228 Liberty St.");

    
    firstLibrary.addBook(new Book("The Da Vinci Code"));
    firstLibrary.addBook(new Book("Le Petit Prince"));
    firstLibrary.addBook(new Book("A Tale of Two Cities"));
    firstLibrary.addBook(new Book("The Lord of the Rings"));
    
 
	System.out.println("Library hours:");
	Library.printOpeningHours();
	System.out.println();

	System.out.println("Library addresses:");
	firstLibrary.printAddress();
	secondLibrary.printAddress();
	System.out.println();

  
    System.out.println("Borrowing The Lord of the Rings:");
    firstLibrary.borrowBook("The Lord of the Rings");
    firstLibrary.borrowBook("The Lord of the Rings");
    secondLibrary.borrowBook("The Lord of the Rings");
    System.out.println();

    
    System.out.println("Books available in the first library:");
    firstLibrary.printAvailableBooks();
    System.out.println();
    System.out.println("Books available in the second library:");
    secondLibrary.printAvailableBooks();
    System.out.println();

    
    System.out.println("Returning The Lord of the Rings:");
    firstLibrary.returnBook("The Lord of the Rings");
    System.out.println();

    
    
  		}
}