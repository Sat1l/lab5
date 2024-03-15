package main.java;

import main.java.app.*;
import main.java.commands.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        App app = App.getInstance();
        app.setScanner(new Scanner(System.in));
        app.setCommandManager(new CommandManager());
        app.setCommandCaller(new CommandCaller());
        app.setConsoleRequestPoller(new ConsoleRequestPoller(app.getScanner(), app.getCommandCaller()));
        app.setCollectionManager(new CollectionManager());
        app.getCollectionManager().setCollection(StorageManager.readStorage());
        app.getCommandManager().add("add", new Add());
        app.getCommandManager().add("save", new Save());
        app.getCommandManager().add("parse", new Parse());
        app.getCommandManager().add("clear", new Clear());
        app.getCommandManager().add("remove_by_id", new RemoveById());
        app.getCommandManager().add("show", new Show());
        app.getCommandManager().add("update_id", new UpdateId());
        app.getCommandManager().add("execute", new Execute());
        app.getCommandManager().add("exit", new Exit());
        app.getCommandManager().add("help", new Help());
        app.getCommandManager().add("info", new Info());
        app.getConsoleRequestPoller().poll();

    }
}
