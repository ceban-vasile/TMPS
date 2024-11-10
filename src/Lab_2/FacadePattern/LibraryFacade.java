package Lab_2.FacadePattern;

import Lab_1.Book;
import Lab_1.BookCatalog;
import Lab_1.Order;

public class LibraryFacade {
    private BookCatalog catalog;

    public LibraryFacade() {
        this.catalog = BookCatalog.getInstance();
    }

    public void placeOrder(String bookTitle, String customerName, String deliveryAddress, boolean expressDelivery, double discount) {
        Book book = catalog.findBookByTitle(bookTitle);
        if (book != null) {
            Order order = new Order.Builder(bookTitle, customerName)
                    .deliveryAddress(deliveryAddress)
                    .expressDelivery(expressDelivery)
                    .discount(discount)
                    .build();
            order.displayOrder();
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}

