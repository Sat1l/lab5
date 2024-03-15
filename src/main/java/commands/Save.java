package main.java.commands;

import main.java.app.App;
import main.java.app.StorageManager;
import main.java.json.JsonWriter;
import main.java.misc.ConsoleGod;
import main.java.model.Flat;

import java.util.Collection;

public class Save extends Command{
    @Override
    public void call(String arg) {
        StorageManager.saveToStorage();
    }

    @Override
    public String getDescription() {
        return "save collection to file";
    }

}
