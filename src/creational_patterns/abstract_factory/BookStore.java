package creational_patterns.abstract_factory;

public class BookStore {
    public static void main(String[] args) {
        BookStoreFactory physicalFactory = new PhysicalBookStoreFactory();

        BookStoreFactory digitalFactory = new DigitalBookStoreFactory();

        Book physicalBook = physicalFactory.createBook("Moby Dick");
        Author physicalAuthor = physicalFactory.createAuthor("Herman Melville");

        Book eBook = digitalFactory.createBook("The Art of Computer Programming");
        Author digitalAuthor = digitalFactory.createAuthor("Donald Knuth");

        physicalBook.displayInfo();
        physicalAuthor.displayBio();

        eBook.displayInfo();
        digitalAuthor.displayBio();
    }
}
