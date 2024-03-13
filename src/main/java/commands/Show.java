package main.java.commands;

import main.java.app.App;
import main.java.app.CollectionManager;
import main.java.misc.ConsoleGod;
import main.java.model.Flat;

import java.util.Collection;
import java.util.Formattable;

public class Show extends Command{

    @Override
    public void call() {
        CollectionManager manager = App.getInstance().getCollectionManager();
        Collection<Flat> flats = manager.getCollection();
        for(Flat flat : flats){
            ConsoleGod.whisper(flat.toString());
        }
    }
}
