package raffo.test.maven.Spring_04;

public class Book {
	String isbn;
	String author;
	String title;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String show()
	{
		return (String)"["+isbn+": "+author+","+title+"]";
	}
	
}
