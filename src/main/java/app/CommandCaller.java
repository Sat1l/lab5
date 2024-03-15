package main.java.app;

import main.java.commands.Command;

import java.util.HashMap;
import java.util.Scanner;

public class CommandCaller {

    CommandManager commandManager = App.getInstance().getCommandManager();

    public CommandCaller(){
    }

    public void call(String request){
        String[] content = request.split(" ", 2);

        String argument = "";
        if (content.length > 1) {
            argument = content[1].trim();
        }
        Command command = commandManager.getCommandByKey(content[0]);
        if (command != null){
            command.call(argument);
        }

    }

}
