package solid_principles.Single_Responsibility;


public class Book {
    String title;
    String author;
    String publisher;
    protected String text;
    int pages;

    public Book(){}

    public Book(String title, String author, String publisher, String text, int pages) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.text = text;
        this.pages = pages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getText() {
        return text;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isAuthor(String author) {
        return this.author.equals(author);
    }

    @Override
    public String toString() {
        return "Name: "+getTitle()+"\nAuthor: "+getAuthor()+"\nPublisher: "+getPublisher()+"\nDescribe: "+getText()+"\nPages: "+getPages();
    }
}
