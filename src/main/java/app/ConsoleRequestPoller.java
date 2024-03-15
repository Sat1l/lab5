package main.java.app;

import java.io.InputStreamReader;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleRequestPoller {

    private final Scanner scanner;

    private final CommandCaller commandCaller;

    public ConsoleRequestPoller(Scanner scanner, CommandCaller commandCaller) {
        this.scanner = scanner;
        this.commandCaller = commandCaller;
    }

    public void poll(){
        String retrieved;
        while(true){
            try {
                retrieved = scanner.nextLine().trim().toLowerCase();
                commandCaller.call(retrieved);
            } catch (NoSuchElementException e){
                commandCaller.call("exit");
            }
        }
    }
}
