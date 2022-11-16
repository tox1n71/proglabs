package ru.itmo.lab3.places;
public class Dungeon extends Place implements DungeonInterface {
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
    public void describe() {
        System.out.println(this.height + ", "+ this.lenght + " " + this.name + " " +  this.light + ".");
    }

    @Override
    public void environment() {
        System.out.println("По всей длине стен шли двери.");
    }
}
