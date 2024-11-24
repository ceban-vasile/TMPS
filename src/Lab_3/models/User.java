package Lab_3.models;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookTitle) {
        System.out.println(name + " has been notified about the new book: " + bookTitle);
    }
}