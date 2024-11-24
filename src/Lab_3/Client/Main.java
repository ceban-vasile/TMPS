package Lab_3.Client;

import Lab_1.Book;
import Lab_1.BookFactory;
import Lab_3.models.BookCatalog;
import Lab_3.models.Observer;
import Lab_3.models.User;

public class Main {

    public static void main(String[] args){

        BookCatalog catalog = BookCatalog.getInstance();
        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        catalog.registerObserver(user1);
        catalog.registerObserver(user2);

        Book ebook = BookFactory.createBook("ebook", "1984", "George Orwell", 9.99);

        catalog.addBook(ebook);

        catalog.displayCatalog();
    }
}
