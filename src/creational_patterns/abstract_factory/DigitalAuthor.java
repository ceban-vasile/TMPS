package creational_patterns.abstract_factory;

public class DigitalAuthor implements Author {
    private String name;

    public DigitalAuthor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayBio() {
        System.out.println("Author: " + name + " (Digital Edition Specialist)");
    }
}

