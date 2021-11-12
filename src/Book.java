
public class Book {
	private String title;
	private String authorName;
	private String publishHouse;
	private int isbn;
	
	int current;
	int isbnLen = 0;
	
	Book(){
		title = null;
		authorName = null;
		publishHouse = null;
		isbn = 0;
	}
	
	public void setTitle(String title) {
		if(title != null && !title.isEmpty()) {
			this.title = title;
		}
	}
	
	public void setAuthorName(String name) {
		if(name != null && !name.isEmpty()) {
			this.authorName = name;
		}
	}
	
	public void setPublishHouse(String publishName) {
		if(publishName != null && !publishName.isEmpty()) {
			this.publishHouse = publishName;
		}
	}
	
	public void setIsbn(int isbn) {
		current = isbn;
		while(current > 0) {
			isbnLen++;
			current = current / 10;
		}
		if(isbnLen == 13) {
			this.isbn = isbn;
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthorName() {
		return authorName;
	}
	
	public String getPublishHouse() {
		return publishHouse;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	Book(String bookTitle, String author, String phouse, int isbn){
		setTitle(bookTitle);
		setAuthorName(author);
		setPublishHouse(phouse);
		setIsbn(isbn);
	}
	
	public String toString() {
		return String.format("Title: %s, Author: %s, Publish House: %s, ISBN: %d",getTitle(), getAuthorName(),getPublishHouse(),getIsbn());
	}
}
