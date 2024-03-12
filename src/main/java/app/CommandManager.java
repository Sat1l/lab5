package main.java.app;

import main.java.commands.Command;

import java.util.HashMap;

public class CommandManager {

    HashMap<String, Command> commands = new HashMap<>();

    public CommandManager(){

    }

    public void add(String key, Command command){
        this.commands.put(key, command);
    }

    public Command getCommandByKey(String key){
        return commands.get(key);
    }

}
