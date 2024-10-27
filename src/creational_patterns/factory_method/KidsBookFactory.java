package creational_patterns.factory_method;

public class KidsBookFactory implements BookFactory{

    @Override
    public Book createBook(String title, String author, double price) {
        return new KidsBook(title, author, price);
    }
}
