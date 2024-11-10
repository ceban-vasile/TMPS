package Lab_2.models.FlyweightPattern;

import Lab_1.Book;
import Lab_1.BookFactory;

import java.util.HashMap;
import java.util.Map;

public class FlyweightBookFactory {
    private Map<String, Book> bookCache = new HashMap<>();

    public Book getBook(String title, String author, double price, String type) {
        String key = title + "-" + author;
        if (!bookCache.containsKey(key)) {
            bookCache.put(key, BookFactory.createBook(type, title, author, price));
        }
        return bookCache.get(key);
    }
}

