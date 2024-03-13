package main.java.app;

import main.java.misc.ConsoleGod;
import main.java.misc.FlatData;
import main.java.model.Coordinates;
import main.java.model.House;
import main.java.model.View;

import java.util.Scanner;

public class DataFetcher {
    public FlatData fetch(){
        FlatData flatData = new FlatData();
        fetchName(flatData);
        fetchCoordinates(flatData);
        fetchArea(flatData);
        fetchNumberOfRooms(flatData);
        fetchBalcony(flatData);
        fetchTimeToMetroOnFoot(flatData);
        fetchView(flatData);
        fetchHouse(flatData);
        return flatData;
    }

    public void fetchName(FlatData flatData){
        ConsoleGod.whisper("write a string for name");
        String name = fetchValue();
        flatData.setName(name);
    }


    public void fetchCoordinates(FlatData flatData){
        Coordinates coordinates = new Coordinates();
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write a double");
        Double coordX = scanner.nextDouble();
        ConsoleGod.whisper("write an int");
        int coordy = scanner.nextInt();
        coordinates.setX(coordX);
        coordinates.setY(coordy);
        flatData.setCoordinates(coordinates);
    }

    public void fetchArea(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write an Int");
        Integer area = scanner.nextInt();
        flatData.setArea(area);
    }

    public void fetchNumberOfRooms(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write an Int");
        Long numberOfRooms = scanner.nextLong();
        flatData.setNumberOfRooms(numberOfRooms);
    }

    public void fetchBalcony(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("Type \"y\" for yes and \"n\" for no");
        String data = scanner.next().trim().toLowerCase();
        if (data.equals("y")){
            flatData.setBalcony(true);
        } else if (data.equals("n")) {
            flatData.setBalcony(false);
        } else{
            throw new RuntimeException("u dumbass thats not it");
        }
    }

    public void fetchTimeToMetroOnFoot(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write a long");
        long timeToMetroOnFoot = scanner.nextLong();
        flatData.setTimeToMetroOnFoot(timeToMetroOnFoot);
    }

    public void fetchView(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write any member of enum VIEW, which are: STREET, PARK, BAD");
        String data = scanner.next();
        View view = View.valueOf(data);
        flatData.setView(view);
    }

    public void fetchHouse(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        House house = new House();
        ConsoleGod.whisper("write a String for housename");
        house.setName(scanner.next());
        ConsoleGod.whisper("write a Long for year");
        house.setYear(scanner.nextLong());
        ConsoleGod.whisper("write a long for numberOfLifts");
        house.setNumberOfLifts(scanner.nextLong());
        flatData.setHouse(house);
    }

    public String fetchValue(boolean nullable){
        Scanner scanner = App.getInstance().getScanner();
        String value = scanner.next();
        if (nullable && (value == "")) {
            return null;
        } else if (!nullable && (value == "")) {
            throw new RuntimeException("this can't be null");
        } else {
            return value;
        }
    }

    public String fetchValue(){
        return fetchValue(false);
    }

}
