package main.java.app;

import java.util.Scanner;

public class App {

    private static App app;

    Scanner scanner;
    CommandManager commandManager;
    CommandCaller commandCaller;
    ConsoleRequestPoller consoleRequestPoller;

    CollectionManager collectionManager;

    private App(){ }

    public static App getInstance(){
        if(app == null){
            app = new App();
        }
        StorageManager.readStorage();
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

}
