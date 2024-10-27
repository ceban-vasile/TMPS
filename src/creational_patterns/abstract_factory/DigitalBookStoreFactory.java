package creational_patterns.abstract_factory;

public class DigitalBookStoreFactory implements BookStoreFactory{

    @Override
    public Book createBook(String title) {
        return new EBook(title);
    }

    @Override
    public Author createAuthor(String name) {
        return new DigitalAuthor(name);
    }
}
