package main.java.model;

public class House {
    private String name; //Поле может быть null
    private Long year; //Значение поля должно быть больше 0

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public long getNumberOfLifts() {
        return numberOfLifts;
    }

    public void setNumberOfLifts(long numberOfLifts) {
        this.numberOfLifts = numberOfLifts;
    }

    private long numberOfLifts; //Значение поля должно быть больше 0
}