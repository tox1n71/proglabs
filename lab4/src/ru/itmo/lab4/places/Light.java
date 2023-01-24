package ru.itmo.lab4.places;

public class Light {
    private LightLevel lvl;
    private String description;
    public Light(LightLevel lvl,String description){
        this.lvl = lvl;
        this.description = description;
    }

    @Override
    public String toString()  {
        return lvl + description;
    }
}
