package creational_patterns;

public class PrintedBook extends Book {
    public PrintedBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Printed Book: " + title + " by " + author + " - $" + price);
    }
}
