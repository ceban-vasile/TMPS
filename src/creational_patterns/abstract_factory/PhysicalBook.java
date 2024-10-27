package creational_patterns.abstract_factory;

public class PhysicalBook implements Book {
    private String title;

    public PhysicalBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void displayInfo() {
        System.out.println("Physical Book: " + title);
    }
}
