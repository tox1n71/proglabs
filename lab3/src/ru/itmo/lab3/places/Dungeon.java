package ru.itmo.lab3.places;

import ru.itmo.lab3.interfaces.Describable;

public class Dungeon extends Place implements Describable {
    private String name;
    private String height;
    private String lenght;
    private Light light;
    public Dungeon(String name, String height, String lenght, Light light){
        super(name, height, lenght, light);
        this.name = name;
        this.height = height;
        this.lenght = lenght;
        this.light = light;

    }

    @Override
    public String describe() {
        return this.height + ", "+ this.lenght + " " + this.name + " " +  this.light + ".";
    }

    public void environment() {
        System.out.println(describe() + "\nПо всей длине стен шли двери.");
    }

    @Override
    public String toString() {
        return name;
    }


}
