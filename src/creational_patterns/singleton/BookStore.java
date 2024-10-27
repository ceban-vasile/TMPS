package creational_patterns.singleton;

public class BookStore {
    public static void main(String[] args) {

        BookstoreCatalog catalog1 = BookstoreCatalog.getInstance();
        BookstoreCatalog catalog2 = BookstoreCatalog.getInstance();

        catalog1.addBook("The Great Gatsby");
        catalog2.addBook("Moby Dick");

        if (catalog1 == catalog2) {
            System.out.println("Both catalog1 and catalog2 are the same instance.");
        }
    }
}
