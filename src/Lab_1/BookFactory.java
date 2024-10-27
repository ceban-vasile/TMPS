package Lab_1;

public class BookFactory {
    public static Book createBook(String type, String title, String author, double price) {
        switch (type.toLowerCase()) {
            case "ebook":
                return new EBook(title, author, price);
            case "printed":
                return new PrintedBook(title, author, price);
            default:
                throw new IllegalArgumentException("Invalid book type");
        }
    }
}
