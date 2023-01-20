package ru.itmo.lab4.furniture;

import ru.itmo.lab4.doors.SmallDoor;
import ru.itmo.lab4.interfaces.Describable;

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
    public void doorDetected(SmallDoor smallDoor){
        System.out.println("За ней была" + " " + smallDoor.toString() + " " + smallDoor.getHeight());
    }


}

