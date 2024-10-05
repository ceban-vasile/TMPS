package solid_principles.Open_Closed;

import solid_principles.Single_Responsibility.Book;

public class BookWriter extends Book {

    String text;

    public BookWriter() {}

    public BookWriter(String title, String author, String publisher, String text, int pages) {
        super(title, author, publisher, pages);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Name: "+getTitle()+"\nAuthor: "+getAuthor()+"\nPublisher: "+getPublisher()+"\nDescribe: "+getText()+"\nPages: "+getPages();
    }
}
