package main.java.commands;

import main.java.app.App;
import main.java.app.CollectionManager;
import main.java.app.DataFetcher;
import main.java.misc.FlatData;
import main.java.model.Flat;

public class Add extends Command {
    @Override
    public void call(String arg) {
        DataFetcher dataFetcher = new DataFetcher();
        CollectionManager collectionManager = App.getInstance().getCollectionManager();
        FlatData flatData = dataFetcher.fetch();
        collectionManager.addFlat(flatData);
    }

    @Override
    public String getDescription() {
        return "add new element to collection using user input";
    }
}
