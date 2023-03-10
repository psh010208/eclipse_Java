
public class Book {

	private String title;
	private String isbn;
	public Book(String title, String isbn) {
		this.title = title;
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + "]";
	}

	public static void main(String[] args) {
		Book mybook = new Book("The Java Tutorial", "0123456");
		System.out.println(mybook);
	}

	
}
