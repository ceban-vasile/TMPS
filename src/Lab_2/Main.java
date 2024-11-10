package Lab_2;

import Lab_1.Book;
import Lab_1.BookCatalog;
import Lab_1.BookFactory;
import Lab_1.Order;
import Lab_2.AdapterPattern.ExternalBook;
import Lab_2.AdapterPattern.ExternalBookAdapter;
import Lab_2.AdapterPattern.ExternalBookLoader;
import Lab_2.CompositePattern.BookCollection;
import Lab_2.DecoratorPattern.SignedBookDecorator;
import Lab_2.FacadePattern.LibraryFacade;
import Lab_2.FlyweightPattern.FlyweightBookFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Book ebook = BookFactory.createBook("ebook", "1984", "George Orwell", 9.99);
        Book printedBook = BookFactory.createBook("printed", "The Great Gatsby", "F. Scott Fitzgerald", 15.99);

        BookCatalog catalog = BookCatalog.getInstance();
        catalog.addBook(ebook);
        catalog.addBook(printedBook);

        catalog.displayCatalog();

        Order order = new Order.Builder("1984", "Alice")
                .deliveryAddress("123 Book Street")
                .expressDelivery(true)
                .discount(2.0)
                .build();

        order.displayOrder();

        System.out.println("1. Facade Pattern");
        LibraryFacade libraryFacade = new LibraryFacade();
        libraryFacade.placeOrder("1984", "Alice", "123 Book Street", true, 2.0);

        System.out.println("\n2. Decorator Pattern");
        Book signedPrintedBook = new SignedBookDecorator(printedBook);
        signedPrintedBook.displayInfo();

        System.out.println("\n3. Composite Pattern");
        BookCollection bookCollection = new BookCollection();
        bookCollection.add(ebook);
        bookCollection.add(signedPrintedBook);
        bookCollection.displayInfo();

        System.out.println("\n4. Flyweight Pattern");
        FlyweightBookFactory bookFactory = new FlyweightBookFactory();
        Book sameEbook = bookFactory.getBook("1984", "George Orwell", 9.99, "ebook");
        sameEbook.displayInfo();

        System.out.println("\n5. Adapter Pattern");

        try {
            ExternalBook externalBook = ExternalBookLoader.loadBookFromJson("src/book.json");
            Book adaptedBook = new ExternalBookAdapter(externalBook);
            catalog.addBook(adaptedBook);
        } catch (IOException e) {
            System.out.println("Error loading external book: " + e.getMessage());
        }

        catalog.displayCatalog();
    }
}
