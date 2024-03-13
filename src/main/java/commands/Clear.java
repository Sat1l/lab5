package main.java.commands;

import main.java.json.JsonParser;
import main.java.json.JsonWriter;
import main.java.model.Flat;

import java.util.Collection;
import java.util.HashSet;

public class Clear extends Command{
    @Override
    public void call() {
        JsonWriter writer = new JsonWriter();
        writer.write(new HashSet<Flat>());
    }
}
