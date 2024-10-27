package creational_patterns.factory_method;

public interface BookFactory {
    Book createBook(String title, String author, double price);
}
