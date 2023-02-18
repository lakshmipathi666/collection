package collection3;

public class Book {
	public Book(int bookId, String authorName, int price, String title, int noOfPages, int edition) {
		super();
		this.bookId = bookId;
		this.authorName = authorName;
		this.price = price;
		this.title = title;
		this.noOfPages = noOfPages;
		this.edition = edition;
	}
	int bookId;
	String authorName;
	int price;
	String title;
	int noOfPages;
	int edition;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", authorName=" + authorName + ", price=" + price + ", title=" + title
				+ ", noOfPages=" + noOfPages + ", edition=" + edition + "]";
	}
	
	
}
