package solid_principles.Open_Closed;

import solid_principles.Single_Responsibility.Book;

public class BookWriter extends Book {

    public BookWriter() {}

    public BookWriter(String title, String author, String publisher, String text, int pages) {
        super(title, author, publisher, text, pages);
    }

    public void setText(String text) {
        this.text = text;
    }
}
