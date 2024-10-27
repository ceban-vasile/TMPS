package creational_patterns.factory_method;

public class FictionBookFactory implements BookFactory {

    @Override
    public Book createBook(String title, String author, double price) {
        return new FictionBook(title, author, price);
    }
}

