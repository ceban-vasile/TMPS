package Lab_2.AdapterPattern;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class ExternalBookLoader {
    public static ExternalBook loadBookFromJson(String filePath) throws IOException {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, ExternalBook.class);
        }
    }
}