package main.java.model;

public class Flat {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer area; //Значение поля должно быть больше 0
    private Long numberOfRooms; //Поле не может быть null, Значение поля должно быть больше 0
    private boolean balcony;
    private long timeToMetroOnFoot; //Значение поля должно быть больше 0
    private View view; //Поле может быть null
    private House house; //Поле не может быть null
}