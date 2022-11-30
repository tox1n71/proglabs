package ru.itmo.lab3.furniture;

import ru.itmo.lab3.interfaces.Describable;

public class Curtain extends Furniture implements Describable {
    private String name;
    private String description;

    public Curtain(String name, String description){
        super(name);
        this.name = name;
        this.description = description;
    }

    @Override
    public String describe() {
        return name + " " + description;
    }
    @Override
    public String toString() {
        return describe();
    }

    public void somethingBehind(){
        System.out.println("А за ней...");
    }


}

