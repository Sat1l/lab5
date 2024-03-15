package main.java.commands;


import main.java.misc.ConsoleGod;

public class Exit extends Command {

    @Override
    public void call(String arg) {
        ConsoleGod.whisper("bye-bye🤫🧏");
        System.exit(0);
    }

    @Override
    public String getDescription() {
        return "Exit program";
    }
}
