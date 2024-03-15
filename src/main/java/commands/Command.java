package main.java.commands;

public abstract class Command {

    public String description;

    public abstract void call(String arg);

    public abstract String getDescription();
}
