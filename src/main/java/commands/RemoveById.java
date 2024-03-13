package main.java.commands;

import main.java.app.App;
import main.java.app.CollectionManager;
import main.java.misc.ConsoleGod;
import main.java.model.Flat;

import java.util.Collection;
import java.util.Scanner;

public class RemoveById extends Command{
    @Override
    public void call() {

        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write an id (int)");
        long id = scanner.nextLong();

        CollectionManager manager = App.getInstance().getCollectionManager();
        Collection<Flat> flats =  manager.getCollection();
        flats.remove(manager.getFlatById(id));
    }
}
