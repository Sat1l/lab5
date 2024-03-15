package main.java.commands;

import main.java.app.App;
import main.java.app.CollectionManager;
import main.java.misc.ConsoleGod;
import main.java.model.Flat;

import java.util.Collection;

public class Info extends Command{
    @Override
    public void call(String arg) {
        CollectionManager manager = App.getInstance().getCollectionManager();
        ConsoleGod.whisper( "collection type: "+  manager.getCollection().getClass().getSimpleName());
        ConsoleGod.whisper("element type: " + Flat.class.getSimpleName());
        ConsoleGod.whisper("element amount: " + manager.getCollection().size());
    }

    @Override
    public String getDescription() {
        return "outputs collection info: type, initialization date, amount of elements";
    }
}
