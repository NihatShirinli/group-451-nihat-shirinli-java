package homework_10;

public class Reader {
	String fullName;
	int readerTicketNumber = 0;
	String borrowedBooks;
	
	
	public void borrowBook(Book b) {
		borrowedBooks += b;
	}
	
	public void returnBook(Book b) {
		borrowedBooks -= b;
	}
	
	public void showBorrowedBooks() {
		System.out.println("Borrowed books: " + borrowedBooks);
	}
}
