package main.java.commands;

import main.java.app.App;
import main.java.misc.ConsoleGod;
import main.java.model.Flat;

public class AvgTimeToMetroOnFoot extends Command{
    @Override
    public void call(String arg) {
        int sum = 0;
        int count = 0;
        for (Flat flat : App.getInstance().getCollectionManager().getCollection()){
            sum += (int) flat.getTimeToMetroOnFoot();
            count += 1;
        }
        ConsoleGod.whisper("average time to metro on foot is: " + sum/count);
    }

    @Override
    public String getDescription() {
        return null;
    }
}
