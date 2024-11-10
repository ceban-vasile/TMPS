package Lab_1;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private static BookCatalog instance;
    private List<Book> books;

    private BookCatalog() {
        books = new ArrayList<>();
    }

    public static synchronized BookCatalog getInstance() {
        if (instance == null) {
            instance = new BookCatalog();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayCatalog() {
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
