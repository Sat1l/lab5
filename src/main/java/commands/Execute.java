package main.java.commands;

import main.java.app.App;
import main.java.app.CommandCaller;
import main.java.misc.ConsoleGod;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Execute extends Command{
    @Override
    public void call(String arg) {

        File file = new File(arg);
        if(App.getInstance().getScriptsStack().contains(file)){
            ConsoleGod.whisper("Recursion detected");
            return;
        }
        try {
            Scanner oldScanner = App.getInstance().getScanner();
            Scanner newScanner = new Scanner(file);
            App.getInstance().getScriptsStack().add(file);
            App.getInstance().setScanner(newScanner);
            CommandCaller commandCaller = App.getInstance().getCommandCaller();
            while (newScanner.hasNextLine()){
                String line = newScanner.nextLine();
                commandCaller.call(line.trim().toLowerCase());
            }
            App.getInstance().setScanner(oldScanner);
            App.getInstance().getScriptsStack().removeLast();
        } catch (FileNotFoundException e) {
            ConsoleGod.whisper("didn't find the desired script file");
        }

    }

    @Override
    public String getDescription() {
        return "execute script from file. Example usage: \"execute script.txt\"";
    }
}
