package Lab_2.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements BookComponent {
    private List<BookComponent> items = new ArrayList<>();

    public void add(BookComponent item) {
        items.add(item);
    }

    @Override
    public void displayInfo() {
        for (BookComponent item : items) {
            item.displayInfo();
        }
    }
}
