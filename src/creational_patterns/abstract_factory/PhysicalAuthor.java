package creational_patterns.abstract_factory;

public class PhysicalAuthor implements Author {
    private String name;

    public PhysicalAuthor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void displayBio() {
        System.out.println("Author: " + name + " (Physical Edition Specialist)");
    }
}

