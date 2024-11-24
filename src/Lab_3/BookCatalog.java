package Lab_3;

import Lab_1.Book;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog implements Subject {
    private static BookCatalog instance;
    private List<Observer> observers;
    private final List<Book> books;

    private BookCatalog() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static BookCatalog getInstance() {
        if (instance == null) {
            instance = new BookCatalog();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book.getTitle());
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

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String bookTitle) {
        for (Observer observer : observers) {
            observer.update(bookTitle);
        }
    }
}
