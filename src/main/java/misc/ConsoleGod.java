package main.java.misc;

import main.java.app.App;

public class ConsoleGod {

    public static void whisper(String revelation){
        if (!App.getInstance().isInteractiveMode()){
            System.out.print("/script output/ ");
        }
        System.out.println(revelation);
    }
}
