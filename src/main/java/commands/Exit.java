package main.java.commands;


public class Exit extends Command {

    @Override
    public void call(String arg) {
        System.exit(0);
    }

    @Override
    public String getDescription() {
        return "Exit program";
    }
}
