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
        app.getCommandManager().add("add", new Add());
        app.getCommandManager().add("save", new Save());
        app.getCommandManager().add("parse", new Parse());
        app.getCommandManager().add("clear", new Clear());
        app.getCommandManager().add("remove_by_id", new RemoveById());
        app.getCommandManager().add("show", new Show());
        app.getConsoleRequestPoller().poll();

    }
}
