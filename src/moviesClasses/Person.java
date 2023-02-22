package movies_classes;

import Enums.Color;

public class Person<T, N, S, U>{
    private String name; //Поле не может быть null
    private T birthday; //Поле может быть null
    private String passportID; //Длина строки не должна быть больше 10, Поле может быть null
    private N hairColor; //Поле может быть null
    private Location location; //Поле может быть null

    public Person(String name, T birthday, String passportID, N hairColor, Location location){
        this.name = name;
        this.birthday = birthday;
        this.passportID = passportID;
        this.hairColor = hairColor;
        this.location = location;
    }

    public String getName(){
        return name;
    }

    public T getBirthday(){
        return birthday;
    }

    public String getPassportID(){
        return passportID;
    }

    public N getHairColor(){
        return hairColor;
    }

    public Location getLocation(){
        return location;
    }
}
