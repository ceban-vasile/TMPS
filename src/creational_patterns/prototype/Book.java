package creational_patterns.prototype;

public class Book implements BookPrototype {
    private String title;
    private String author;
    private String genre;
    private double price;

    public Book(String title, String author, String genre, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Price: $" + price);
    }

    @Override
    public BookPrototype clone() {
        System.out.println("Cloning Book: " + title);
        return new Book(title, author, genre, price);
    }
}

