package main.java.app;

import main.java.json.JsonParser;
import main.java.json.JsonWriter;
import main.java.misc.ConsoleGod;
import main.java.model.Flat;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class StorageManager {

    public static Collection<Flat> readStorage(){
        JsonParser parser = new JsonParser();
//        try {
        return parser.parse();
//        } catch (NullPointerException e) {
//            File newStorage = new File("./data.json");
//            try {
//                newStorage.createNewFile();
//                App.getInstance().setDataPath("./data.json");
//                ConsoleGod.whisper("couldn't find the provided file. Created \"data.json\" instead.");
//            } catch (IOException ex) {
//                ConsoleGod.whisper("for some reason i was not able to create a file");
//            }
//        }
    }

    public static void saveToStorage(){
        JsonWriter writer = new JsonWriter();
        Collection<Flat> flats = App.getInstance().getCollectionManager().getCollection();
        writer.write(flats);
    }
}
