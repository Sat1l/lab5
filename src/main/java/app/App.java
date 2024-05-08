package main.java.app;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class App {

    private static App app;

    Scanner scanner;
    CommandManager commandManager;
    CommandCaller commandCaller;
    ConsoleRequestPoller consoleRequestPoller;

    CollectionManager collectionManager;

    String dataPath;

    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    private final Deque<File> scriptsStack = new ArrayDeque<>();

    private App(){ }

    public static App getInstance(){
        if(app == null){
            app = new App();
        }
        return app;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public CommandManager getCommandManager() {
        return commandManager;
    }

    public CommandCaller getCommandCaller() {
        return commandCaller;
    }

    public ConsoleRequestPoller getConsoleRequestPoller() {
        return consoleRequestPoller;
    }

    public CollectionManager getCollectionManager() {
        return collectionManager;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setCommandManager(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    public void setCommandCaller(CommandCaller commandCaller) {
        this.commandCaller = commandCaller;
    }

    public void setConsoleRequestPoller(ConsoleRequestPoller consoleRequestPoller) {
        this.consoleRequestPoller = consoleRequestPoller;
    }

    public void setCollectionManager(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public Deque<File> getScriptsStack() {
        return scriptsStack;
    }

    public boolean isInteractiveMode() {
        return scriptsStack.isEmpty();
    }

}
