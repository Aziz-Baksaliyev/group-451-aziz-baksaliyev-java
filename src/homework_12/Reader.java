package homework_12;

	public class Reader {
	    public String fullName;
	    public Book[] borrowedBooks = new Book[5];
	    public int booksCount = 0;

	    public Reader(String fullName) {
	        this.fullName = fullName;
	    }

	    public void borrowBook(Book b) {
	        if (b.isAvailable) {
	            if (booksCount < 5) {
	                borrowedBooks[booksCount] = b;
	                booksCount = booksCount + 1;
	                b.isAvailable = false;
	                System.out.println(fullName + " взял книгу: " + b.title);
	            }
	        }
	    }
	}
