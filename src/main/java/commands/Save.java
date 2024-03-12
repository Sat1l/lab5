package main.java.commands;

import main.java.app.App;
import main.java.json.JsonWriter;
import main.java.misc.ConsoleGod;
import main.java.model.Flat;

import java.util.Collection;

public class Save extends Command{
    @Override
    public void call() {
        JsonWriter jsonWriter = new JsonWriter();
        System.out.println(jsonWriter);
        Collection<Flat> flats = App.getInstance().getCollectionManager().getCollection();
        jsonWriter.write(flats);
        ConsoleGod.whisper("Collection saved to data.json.");
    }

}
