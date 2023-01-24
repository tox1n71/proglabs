package ru.itmo.lab4.furniture;

import ru.itmo.lab4.interfaces.VisibleObject;

public abstract class Furniture implements VisibleObject {
    private String name;

    public Furniture(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
