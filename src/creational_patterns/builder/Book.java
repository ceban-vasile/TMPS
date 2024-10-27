package creational_patterns.builder;

public class Book {
    private final String title;
    private final String author;

    private final String genre;
    private final String isbn;
    private final double price;
    private final int pages;
    private final String publisher;

    private Book(Builder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.genre = builder.genre;
        this.isbn = builder.isbn;
        this.price = builder.price;
        this.pages = builder.pages;
        this.publisher = builder.publisher;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (genre != null) System.out.println("Genre: " + genre);
        if (isbn != null) System.out.println("ISBN: " + isbn);
        if (price > 0) System.out.println("Price: " + price+" Lei");
        if (pages > 0) System.out.println("Pages: " + pages);
        if (publisher != null) System.out.println("Publisher: " + publisher);
    }

    public static class Builder {
        private final String title;
        private final String author;

        private String genre = null;
        private String isbn = null;
        private double price = 0;
        private int pages = 0;
        private String publisher = null;

        public Builder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder pages(int pages) {
            this.pages = pages;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
