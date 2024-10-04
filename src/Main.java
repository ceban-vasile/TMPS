import solid_principles.Open_Closed.BookWriter;
import solid_principles.Single_Responsibility.Book;
import solid_principles.Single_Responsibility.BookPrinter;

public class Main {
    public static void main(String[] args) {
        Book book = new BookWriter("Dragoste", "Tofan Liviu", "10/04/2024", "qwertyu", 69);
        BookPrinter printer = new BookPrinter();
        printer.printBook(book);
        ((BookWriter) book).setText("123456");
        printer.printBook(book);
    }
}