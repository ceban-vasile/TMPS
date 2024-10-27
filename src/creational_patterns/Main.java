package creational_patterns;

public class Main {
    public static void main(String[] args) {

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
    }
}
