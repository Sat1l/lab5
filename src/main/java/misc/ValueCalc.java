package main.java.misc;

import main.java.model.Flat;

public class ValueCalc {
    public static int evaluate(Flat flat){
        return (int) (flat.getArea()*41 + flat.getNumberOfRooms()*23 + flat.getTimeToMetroOnFoot()*29);
    }

    public static int evaluate(FlatData flat){
        return (int) (flat.getArea()*41 + flat.getNumberOfRooms()*23 + flat.getTimeToMetroOnFoot()*29);
    }
}
