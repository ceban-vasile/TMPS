package Lab_1;

import Lab_2.models.CompositePattern.BookComponent;

public abstract class Book implements BookComponent {
    public String title;
    public String author;
    public double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public abstract void displayInfo();
}
