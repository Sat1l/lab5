package main.java.commands;

import main.java.app.App;
import main.java.json.JsonParser;

public class Parse extends Command {

    @Override
    public void call(String arg) {
        JsonParser parser = new JsonParser();
        App.getInstance().getCollectionManager().setCollection(parser.parse());
        System.out.println("Коллекция успешно загружена из файла");
    }

    @Override
    public String getDescription() {
        return "debug program used to parse data from json to program";
    }
}

