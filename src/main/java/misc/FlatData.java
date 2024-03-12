package main.java.misc;

import main.java.model.Coordinates;
import main.java.model.House;
import main.java.model.View;

public class FlatData {

    private String name;
    private Coordinates coordinates;
    private Integer area;
    private Long numberOfRooms;
    private boolean balcony;
    private long timeToMetroOnFoot;
    private View view;
    private House house;

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public void setNumberOfRooms(Long numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public void setTimeToMetroOnFoot(long timeToMetroOnFoot) {
        this.timeToMetroOnFoot = timeToMetroOnFoot;
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Integer getArea() {
        return area;
    }

    public Long getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public long getTimeToMetroOnFoot() {
        return timeToMetroOnFoot;
    }

    public View getView() {
        return view;
    }

    public House getHouse() {
        return house;
    }
}
