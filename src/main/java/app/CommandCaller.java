package main.java.app;

import main.java.commands.Command;
import main.java.exceptions.NoSuchCommandException;
import main.java.misc.ConsoleGod;

import java.io.Console;
import java.util.HashMap;
import java.util.Scanner;

public class CommandCaller {

    CommandManager commandManager = App.getInstance().getCommandManager();

    public CommandCaller(){
    }

    public void call(String request) {
        String[] content = request.split(" ", 2);

        String argument = "";
        if (content.length > 1) {
            argument = content[1].trim();
        }
        try {
            Command command = commandManager.getCommandByKey(content[0]);
            command.call(argument);
        } catch (NoSuchCommandException e){
            ConsoleGod.whisper("didn't find command: " + e.getMessage());
        }
    }

}
