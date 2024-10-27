package Lab_1;

public class EBook extends Book {
    public EBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("EBook: " + title + " by " + author + " - $" + price);
    }
}

