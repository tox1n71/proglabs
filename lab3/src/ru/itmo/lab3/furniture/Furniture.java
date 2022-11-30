package ru.itmo.lab3.furniture;

import ru.itmo.lab3.interfaces.VisibleObject;

public abstract class Furniture implements VisibleObject {
    private String name;

    public Furniture(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
