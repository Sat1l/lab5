package main.java.commands;

import main.java.app.App;
import main.java.misc.ConsoleGod;

import java.util.Scanner;

public class UpdateId extends Command{
    @Override
    public void call() {

        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write an id (int)");
        long id = scanner.nextLong();


    }
}
