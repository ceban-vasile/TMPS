package creational_patterns.abstract_factory;

public interface BookStoreFactory {
    Book createBook(String title);
    Author createAuthor(String name);
}
