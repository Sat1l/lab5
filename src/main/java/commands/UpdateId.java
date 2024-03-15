package main.java.commands;

import main.java.app.App;
import main.java.app.CollectionManager;
import main.java.app.DataFetcher;
import main.java.misc.ConsoleGod;
import main.java.misc.FlatData;

import java.util.Scanner;

public class UpdateId extends Command{
    @Override
    public void call(String arg) {
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write an id (int)");
        long id = scanner.nextLong();
        DataFetcher fetcher = new DataFetcher();
        CollectionManager manager = App.getInstance().getCollectionManager();
        FlatData flatData = fetcher.fetch();
        manager.updateById(id, flatData);
    }

    @Override
    public String getDescription() {
        return "update element's properties by id";
    }
}
