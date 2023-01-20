package ru.itmo.lab4.doors;

public class SmallDoor extends Door{
    private String height;

    public SmallDoor(String name, String pattern, String height){
        super(name, pattern);
        this.height = height;
    }

    @Override
    public String toString(){
        return getName();
    }
    public String getHeight(){
        return height;
    }
}
