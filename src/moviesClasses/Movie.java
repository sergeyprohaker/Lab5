package movies_classes;

import Enums.MovieGenre;
import Enums.MpaaRating;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeSet;

public class Movie {
    private Integer id;
    private String name;
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDate creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int oscarsCount; //Значение поля должно быть больше 0
    private Integer length; //Поле не может быть null, Значение поля должно быть больше 0
    private MovieGenre genre; //Поле не может быть null
    private MpaaRating mpaaRating; //Поле может быть null
    private Person director; //Поле не может быть null


    public Movie(Integer id, String name, Coordinates coordinates, java.time.LocalDate creationDate, int oscarsCount, Integer length, MovieGenre genre, MpaaRating mpaaRating, Person director){
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.oscarsCount = oscarsCount;
        this.length = length;
        this.genre = genre;
        this.mpaaRating = mpaaRating;
        this.director = director;
    }


    public int compareTo(Movie o1) {
        return this.id.compareTo(o1.id);
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public Integer getLength(){
        return length;
    }

    public int getOscarsCount() {
        return oscarsCount;
    }

    @Override
    public String toString(){
        return "Movie{id=" + id + ", name=" + name + ", coordinates=[" + "x:" + coordinates.getX() + "y:" + coordinates.getY() + "]" + ", " +
                "creationDate=" + creationDate + ", oscarsCount=" + oscarsCount + ", length=" + length + ", genre=" + genre + ", " +
                "mpaaRating=" + mpaaRating + ", director: [" + director.getName() + director.getPassportID() + director.getBirthday() +
                "location:[" + director.getLocation().getX() + director.getLocation().getY() + director.getLocation().getZ() + director.getLocation().getName() + "]]" + "}";
    }

}