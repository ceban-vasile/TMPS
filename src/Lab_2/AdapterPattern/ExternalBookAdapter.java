package Lab_2.AdapterPattern;

import Lab_1.Book;

public class ExternalBookAdapter extends Book {
    private ExternalBook externalBook;

    public ExternalBookAdapter(ExternalBook externalBook) {
        super(externalBook.getTitle(), externalBook.getAuthor(), externalBook.getPrice());
        this.externalBook = externalBook;
    }

    @Override
    public void displayInfo() {
        System.out.println("External Book: " + title + " by " + author + " - $" + price);
    }
}
