package main.java.commands;

import main.java.app.App;
import main.java.json.JsonParser;
import main.java.json.JsonWriter;
import main.java.model.Flat;

import java.util.Collection;
import java.util.HashSet;

public class Clear extends Command{
    @Override
    public void call(String arg) {
        App.getInstance().getCollectionManager().setCollection(new HashSet<Flat>());
    }

    @Override
    public String getDescription() {
        return "clear collection";
    }
}
