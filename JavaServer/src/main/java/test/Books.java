package test;

public class Books {
	
	private int book_id;
	private String title;
	private String author_id;
	private int year;
	
	
	public Books () {
		
	}
	public Books(int id, String title, String author, int year) {
		this.book_id = id;
		this.title = title;
		this.author_id = author;
		this.year = year;
		
	}

	public int getId() {
		return book_id;
	}

	public void setId(int id) {
		this.book_id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author_id;
	}

	public void setAuthor(String author) {
		this.author_id = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book id=" + book_id + ", title=" + title + ", author=" + author_id + ", year=" + year + "]";
	}
	
	
	

}