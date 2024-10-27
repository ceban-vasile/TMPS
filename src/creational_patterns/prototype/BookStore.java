package creational_patterns.prototype;

public class BookStore {
    public static void main(String[] args) {
        Book originalBook = new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", 18.99);

        Book clonedBook = (Book) originalBook.clone();
        clonedBook.setTitle("Go Set a Watchman");
        clonedBook.setPrice(20.99);

        System.out.println("Original Book:");
        originalBook.displayInfo();
        System.out.println("\nCloned Book:");
        clonedBook.displayInfo();
    }
}
