package creational_patterns.factory_method;

public class BookStore {
    public static void main(String[] args) {
        BookFactory fictionFactory = new FictionBookFactory();
        BookFactory childrenFactory = new KidsBookFactory();

        Book fictionBook = fictionFactory.createBook("1984", "George Orwell", 10.99);
        Book childrenBook = childrenFactory.createBook("The Little Prince", "Antoine de Saint-Exupéry", 8.99);

        fictionBook.displayInfo();
        childrenBook.displayInfo();
    }
}
