package main.java.app;

import main.java.json.JsonParser;
import main.java.json.JsonWriter;
import main.java.model.Flat;

import java.util.Collection;

public class StorageManager {

    public static Collection<Flat> readStorage(){
        JsonParser parser = new JsonParser();
        return parser.parse();
    }

    public static void saveToStorage(){
        JsonWriter writer = new JsonWriter();
        Collection<Flat> flats = App.getInstance().getCollectionManager().getCollection();
        writer.write(flats);
    }
}
