package ru.itmo.lab3.keys;

import ru.itmo.lab3.interfaces.VisibleObject;
import ru.itmo.lab3.furniture.Furniture;

import java.util.Objects;

public abstract class Key implements VisibleObject {
    private String name;
    private String pattern;


    public Key(String name, String pattern){
        this.name = name;
        this.pattern = pattern;
    }

    public void lieOn(Furniture smth){
        System.out.println(name + " лежал на " + smth.toString() );
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
