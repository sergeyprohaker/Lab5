package movies_classes;

public class Location<T,N>{
    private float x; //Поле не может быть null
    private Integer y; //Поле не может быть null
    private T z; //Поле может быть null
    private N name; //Строка не может быть пустой, Поле может быть null
    public Location(float x, Integer y, T z, N name){
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public float getX(){
        return x;
    }

    public Integer getY(){
        return y;
    }

    public T getZ(){
        return z;
    }

    public N getName(){
        return name;
    }

}
