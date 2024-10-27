package creational_patterns.factory_method;

public class FictionBook implements Book {

    String name;
    String author;
    double price;

    public FictionBook(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + " Author: " + author + " Price: " + price+"\n");
    }
}
