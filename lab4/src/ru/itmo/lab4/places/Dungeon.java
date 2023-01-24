package ru.itmo.lab4.places;

import ru.itmo.lab4.interfaces.Describable;

public class Dungeon extends Place implements Describable {
    private String name;
    private static String height;
    private static String lenght;
    private static Light light;
    public Dungeon(String name, String h, String le, Light li){
        super(name, height, lenght, light);
        this.name = name;
        height = h;
        lenght = le;
        light = li;
    }

    public static class Drawing{
        public static String getHeight(){
            return height;
        }
        public static String getLenght(){
            return lenght;
        }
        public static Light getLight(){
            return light;
        }
    }

    @Override
    public String describe() {
        return Drawing.getHeight() + ", " + Drawing.getLenght() + " " + this.name + " " + Drawing.getLight() + ".";
    }

    public void environment() {
        System.out.println(describe() + "\nПо всей длине стен шли двери.");
    }

    @Override
    public String toString() {
        return name;
    }
}
