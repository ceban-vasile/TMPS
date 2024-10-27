Topic: Creational Design Patterns

Theme: Library Management System
Author: Ceban Vasile, FAF-223

Objectives
The goal of this project is to design a Library Management System that allows users to borrow and return books while managing user and book data efficiently. This project demonstrates the application of three creational design patterns: Factory Method, Singleton, and Builder.

Implementation
The system is divided into multiple responsibilities:

Factory Method: Used to create different types of books (EBook, PrintedBook) without specifying the exact class at runtime.
Singleton: Ensures there is only one instance of the BookCatalog throughout the system.
Builder: Facilitates the construction of complex Order objects.
Core Classes
Book Interface: Defines the properties and behaviors of books.
Concrete Books: EBook and PrintedBook extend the Book interface.
BookFactory: Responsible for the dynamic creation of book types.
BookCatalog (Singleton): Manages the library's catalog.
Order (Builder): Constructs orders with optional parameters (e.g., express delivery, discounts).
Key Creational Patterns
1. Factory Method Pattern
The Factory Method Pattern provides an interface for creating different book types without specifying the concrete classes. This allows easy extension with new book types like EBook or AudioBook.

Example: Book Interface

java
Copy code
public interface Book {
    String getTitle();
    String getDescription();
}
EBook Implementation:

java
Copy code
public class EBook implements Book {
    private String title;
    private String description;
    private String fileFormat;

    public EBook(String title, String description, String fileFormat) {
        this.title = title;
        this.description = description;
        this.fileFormat = fileFormat;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public String getFileFormat() {
        return fileFormat;
    }
}
BookFactory:

java
Copy code
public class BookFactory {
    public static Book createBook(String type, String title, String description, String format) {
        switch (type.toLowerCase()) {
            case "ebook":
                return new EBook(title, description, format);
            case "printed":
                return new PrintedBook(title, description);
            default:
                throw new IllegalArgumentException("Unknown book type");
        }
    }
}
2. Singleton Pattern
The Singleton Pattern ensures that only one instance of the BookCatalog exists. This catalog manages the list of available books in the library.

BookCatalog Singleton:

java
Copy code
import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private static BookCatalog instance;
    private List<Book> books = new ArrayList<>();

    private BookCatalog() {}

    public static synchronized BookCatalog getInstance() {
        if (instance == null) {
            instance = new BookCatalog();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listBooks() {
        books.forEach(book -> System.out.println(book.getTitle()));
    }
}
3. Builder Pattern
The Builder Pattern helps to construct complex Order objects step-by-step, allowing optional parameters like discounts or delivery options to be set.

Order Class with Builder:

java
Copy code
public class Order {
    private String bookTitle;
    private String customerName;
    private String deliveryAddress;
    private boolean expressDelivery;
    private double discount;

    private Order(Builder builder) {
        this.bookTitle = builder.bookTitle;
        this.customerName = builder.customerName;
        this.deliveryAddress = builder.deliveryAddress;
        this.expressDelivery = builder.expressDelivery;
        this.discount = builder.discount;
    }

    public static class Builder {
        private String bookTitle;
        private String customerName;
        private String deliveryAddress = "";
        private boolean expressDelivery = false;
        private double discount = 0.0;

        public Builder(String bookTitle, String customerName) {
            this.bookTitle = bookTitle;
            this.customerName = customerName;
        }

        public Builder deliveryAddress(String address) {
            this.deliveryAddress = address;
            return this;
        }

        public Builder expressDelivery(boolean express) {
            this.expressDelivery = express;
            return this;
        }

        public Builder discount(double discount) {
            this.discount = discount;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public void displayOrder() {
        System.out.println("Order for: " + customerName);
        System.out.println("Book: " + bookTitle);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Express Delivery: " + (expressDelivery ? "Yes" : "No"));
        System.out.println("Discount: $" + discount);
    }
}
Conclusion
This Library Management System demonstrates the practical application of creational design patterns to build a maintainable and extendable codebase:

Factory Method: Makes the system flexible by allowing new book types to be added without modifying the core logic.
Singleton: Ensures that only one instance of the BookCatalog exists, avoiding inconsistencies in data management.
Builder: Simplifies the construction of complex objects like orders with optional parameters.
This design leads to a more modular and scalable application, making future enhancements and maintenance more straightforward.
