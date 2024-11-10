package Lab_2.DecoratorPattern;

import Lab_1.Book;

public class SignedBookDecorator extends Book {
    private Book book;

    public SignedBookDecorator(Book book) {
        super(book.title, book.author, book.price);
        this.book = book;
    }

    @Override
    public void displayInfo() {
        book.displayInfo();
        System.out.println(" - Signed by the author");
    }
}

