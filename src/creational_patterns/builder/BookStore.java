package creational_patterns.builder;

public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book.Builder("The Catcher in the Rye", "J.D. Salinger").build();

        Book book2 = new Book.Builder("1984", "George Orwell")
                .genre("Dystopian")
                .isbn("978-0451524935")
                .price(9.99)
                .pages(328)
                .publisher("Secker & Warburg")
                .build();

        System.out.println("Basic Book:");
        book1.displayInfo();
        System.out.println("\nDetailed Book:");
        book2.displayInfo();
    }
}
