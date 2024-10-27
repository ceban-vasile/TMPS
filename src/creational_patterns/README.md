# Creational Design Patterns  

## Author: Ceban Vasile, FAF-223  

---

## Objectives:  
* Get familiar with the Creational Design Patterns (CDPs).  
* Choose a specific domain: **Library Management System**.  
* Implement at least 3 CDPs for the specific domain:  
  - **Factory Method**  
  - **Singleton**  
  - **Builder**  

---

## Used Design Patterns:  
* **Factory Method**: To dynamically create different book types.  
* **Singleton**: To ensure only one instance of the book catalog exists.  
* **Builder**: To construct orders with optional parameters.  

---

## Implementation  
The Library Management System enables users to borrow and return books. It demonstrates the use of three creational patterns:  
- **Factory Method**: To create instances of books (EBooks or Printed Books).  
- **Singleton**: To ensure that only one catalog instance manages all books.  
- **Builder**: To create flexible orders with options like express delivery and discounts.  

Below are code snippets from the implementation:  

```java
// Factory Method Example
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

// Singleton Example
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
``` 
## Screenshots
### Example:
```
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
```
![image](https://github.com/user-attachments/assets/09ecab3e-2a2d-41a4-8f58-1dba06206902)

### Results:  
- Books successfully created using the Factory Method.  
- Singleton catalog ensures a consistent view of all available books.  
- Order Builder pattern allows for the creation of customized book orders.  
## Conclusions  
In conclusion, in this project i have implemented the creative design patterns **Factory Method**, **Singleton**, **Builder**, and the basic principles of software design, ensuring that the code is modular, easy to maintain and adaptable to future changes.

