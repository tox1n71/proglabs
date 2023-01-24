package ru.itmo.lab4.furniture;

import ru.itmo.lab4.interfaces.Describable;
import ru.itmo.lab4.doors.*;

public class Curtain extends Furniture implements Describable {
    private String description;

    public Curtain(String name, String description) {
        super(name);
        this.description = description;
    }

    @Override
    public String describe() {
        return getName() + " " + description;
    }

    @Override
    public String toString() {
        return describe();
    }

    public void somethingBehind() {
        System.out.println("А за ней...");
    }
    public void doorDetected(Door.SmallDoor smallDoor){
        System.out.println("За ней была" + " " + smallDoor.toString() + " " + smallDoor.getHeight());
    }


}

