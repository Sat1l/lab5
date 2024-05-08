package main.java.commands;

import main.java.app.App;
import main.java.app.CollectionManager;
import main.java.misc.ConsoleGod;
import main.java.misc.ValueCalc;
import main.java.model.Flat;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveGreater extends Command {
    @Override
    public void call(String arg) {

        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write an id (int)");
        long id = scanner.nextLong();

        CollectionManager manager = App.getInstance().getCollectionManager();
        Collection<Flat> flats =  manager.getCollection();
        Flat ref = manager.getFlatById(id);
        HashSet<Flat> newFlats = new HashSet<>();

        for (Flat flat : flats){
            if (ValueCalc.evaluate(flat) < ValueCalc.evaluate(ref)){
                newFlats.add(flat);
            }
        }
        newFlats.add(ref);
        manager.setCollection(newFlats);
    }

    @Override
    public String getDescription() {
        return "removes all of the elements that are higher then n";
    }
}
