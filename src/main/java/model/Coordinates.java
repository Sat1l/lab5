package main.java.model;

import main.java.misc.ConsoleGod;

public class Coordinates {
    private Double x; //Максимальное значение поля: 815, Поле не может быть null
    private int y;

    public Double getX() {
        return x;
    }

    public Coordinates(){
        this.x = 0D;
        this.y = 0;
    }

    public void setX(Double x) {
        if (x > 815D){
            ConsoleGod.whisper("thats more then the allowed max of 815! setting 815.");
            this.x = 815D;
        } else {
            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
