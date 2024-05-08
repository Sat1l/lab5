package main.java.app;

import main.java.exceptions.CantBeNullException;
import main.java.misc.ConsoleGod;
import main.java.misc.FlatData;
import main.java.model.Coordinates;
import main.java.model.House;
import main.java.model.View;

import java.security.cert.TrustAnchor;
import java.util.Locale;
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
        ConsoleGod.whisper("write a string for flat's name");
        String name = fetchString();
        flatData.setName(name);
    }


    public void fetchCoordinates(FlatData flatData){
        Coordinates coordinates = new Coordinates();
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write a double for X coordinate");
        Double coordX = fetchDouble();
        coordinates.setX(coordX);
        ConsoleGod.whisper("write an int for Y coordinate");
        int coordy = fetchInt();
        coordinates.setY(coordy);
        flatData.setCoordinates(coordinates);
    }

    public void fetchArea(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write an int for flat's area");
        Integer area = fetchInt();
        flatData.setArea(area);
    }

    public void fetchNumberOfRooms(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write an int for amount of rooms");
        Long numberOfRooms = fetchLong();
        flatData.setNumberOfRooms(numberOfRooms);
    }

    public void fetchBalcony(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("Does have balcony? Type (y/[n])");
        boolean data = fetchBoolean();
        flatData.setBalcony(data);
    }

    public void fetchTimeToMetroOnFoot(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write a long");
        long timeToMetroOnFoot = fetchLong();
        flatData.setTimeToMetroOnFoot(timeToMetroOnFoot);
    }

    public void fetchView(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        ConsoleGod.whisper("write any member of enum VIEW, which are: STREET, PARK, BAD");
        View view = fetchEnumView();
        flatData.setView(view);
    }

    public void fetchHouse(FlatData flatData){
        Scanner scanner = App.getInstance().getScanner();
        House house = new House();
        ConsoleGod.whisper("write a String for housename");
        house.setName(fetchString());
        ConsoleGod.whisper("write a Long for year");
        house.setYear(fetchLong());
        ConsoleGod.whisper("write a long for numberOfLifts");
        house.setNumberOfLifts(fetchLong());
        flatData.setHouse(house);
    }

    public String fetchValue(boolean nullable){
        Scanner scanner = App.getInstance().getScanner();
        String value = scanner.nextLine().trim();
        if (nullable && (value == "")) {
            return null;
        } else if (!nullable && (value.isEmpty())) {
            throw new CantBeNullException();
        } else {
            return value;
        }
    }

    public String fetchValue(){
        return fetchValue(false);
    }

    public int fetchInt(){
        while (true){
            try {
                return Integer.parseInt(fetchValue());
            } catch (NumberFormatException | CantBeNullException e){
                ConsoleGod.whisper("that's not an int u fool!");
            }
        }
    }

    public double fetchDouble() {
        while (true) {
            try {
                return Double.parseDouble(fetchValue());
            } catch (NumberFormatException | CantBeNullException  e) {
                ConsoleGod.whisper("that's not a double u fool!");
            }
        }
    }

    public long fetchLong() {
        while (true) {
            try {
                return Long.parseLong(fetchValue());
            } catch (NumberFormatException | CantBeNullException e) {
                ConsoleGod.whisper("that's not a long u fool!");
            }
        }
    }


    public boolean fetchBoolean(){
        while (true) {
            try {
                String data = fetchValue(true);
                if (data == null || data.equals("n")){
                    return false;
                } else if (data.equals("y")) {
                    return true;
                } else {
                    ConsoleGod.whisper("that's not an allowed string u fool! type either y/[n]");
                }
            } catch (NumberFormatException e) {
                ConsoleGod.whisper("that's not an allowed string u fool! type either y/[n]");
            }
        }
    }

    public View fetchEnumView() {
        while (true) {
            try {
                return View.valueOf(fetchValue().toUpperCase());
            } catch (IllegalArgumentException e) {
                ConsoleGod.whisper("that's not an available ENUM name u fool!");
            }
        }
    }

    public String fetchString(){
        while (true){
            try{
                return fetchValue();
            } catch (CantBeNullException e){
                ConsoleGod.whisper("this field can't be null");
            }
        }
    }

}
