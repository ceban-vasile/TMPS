package creational_patterns.singleton;

public class BookstoreCatalog {
    private static final BookstoreCatalog instance = new BookstoreCatalog();

    private BookstoreCatalog() {
        System.out.println("Initializing Bookstore Catalog...");
    }

    public static BookstoreCatalog getInstance() {
        return instance;
    }

    public void addBook(String title) {
        System.out.println("Book added: " + title);
    }

    public void removeBook(String title) {
        System.out.println("Book removed: " + title);
    }

    public void displayCatalog() {
        System.out.println("Displaying the catalog...");
    }
}
