package main.java;

import main.java.app.*;
import main.java.commands.Add;
import main.java.commands.Save;

import java.util.HashMap;
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
        app.getConsoleRequestPoller().poll();

    }
}
