package ru.itmo.lab3;

import ru.itmo.lab3.places.Place;

import java.util.Objects;

public class Key {
    private String name;
    private String pattern;
    private Place place;

    public Key(String name, Place place, String pattern){
        this.name = name;
        this.place = place;
        this.pattern = pattern;
    }

    public String getPattern(){
        return pattern;
    }

    @Override
    public String toString() {
        return name;}

    @Override
    public int hashCode() {
        return Objects.hash(pattern);}

}
