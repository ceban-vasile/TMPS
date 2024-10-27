package creational_patterns.abstract_factory;

public class PhysicalBookStoreFactory implements BookStoreFactory {
    @Override
    public Book createBook(String title) {
        return new PhysicalBook(title);
    }

    @Override
    public Author createAuthor(String name) {
        return new PhysicalAuthor(name);
    }
}
