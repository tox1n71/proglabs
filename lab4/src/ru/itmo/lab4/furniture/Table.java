package ru.itmo.lab4.furniture;

import ru.itmo.lab4.interfaces.Describable;

public class Table extends Furniture implements Describable {
    private String name;
    private String description;

    public Table(String name, String description){
        super(name);
        this.name = name;
        this.description = description;

    }

    @Override
    public String describe() {
        return description + " " + name;
    }
    @Override
    public String toString() {
        return describe();
    }


}



