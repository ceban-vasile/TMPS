package Lab_2.models.AdapterPattern;

public class ExternalBook {
    private String title;
    private String author;
    private double price;

    public ExternalBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

