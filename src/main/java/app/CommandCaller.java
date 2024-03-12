package main.java.app;

import main.java.commands.Command;

import java.util.HashMap;
import java.util.Scanner;

public class CommandCaller {

    CommandManager commandManager = App.getInstance().getCommandManager();

    public CommandCaller(){
    }

    public void call(String request){
        String[] content = request.split(" ");
        Command command = commandManager.getCommandByKey(content[0]);
        try {
            command.call();
        } catch (NullPointerException e) {
        }
    }

}
