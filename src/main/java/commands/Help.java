package main.java.commands;

import main.java.app.App;
import main.java.app.CommandManager;
import main.java.misc.ConsoleGod;

import java.util.HashMap;
import java.util.Map;

public class Help extends Command {
    @Override
    public void call(String arg) {
        CommandManager manager = App.getInstance().getCommandManager();
        HashMap<String, Command> commands = manager.getCommands();
        for (Map.Entry<String, Command> entry : commands.entrySet()){
            ConsoleGod.whisper(entry.getKey() + " - " + entry.getValue().getDescription());
        }
    }

    @Override
    public String getDescription() {
        return "this command. Returns a list of all available commands";
    }
}
