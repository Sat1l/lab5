package main.java.commands;

import main.java.app.App;
import main.java.misc.ConsoleGod;
import main.java.model.Flat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class PrintDescendingTTMOF extends Command {
    @Override
    public void call(String arg) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (Flat flat : App.getInstance().getCollectionManager().getCollection()){
            numbers.add(Math.toIntExact(flat.getTimeToMetroOnFoot()));
        }
        numbers.sort(Collections.reverseOrder());
        ConsoleGod.whisper(numbers.toString());
    }

    @Override
    public String getDescription() {
        return null;
    }
}
