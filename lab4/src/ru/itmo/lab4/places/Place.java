package ru.itmo.lab4.places;
public abstract class Place {
    private String name;
    private String height;
    private String lenght;
    private Light light;



    public Place(String name, String height, String lenght, Light light){
        this.name = name;
        this.height = height;
        this.lenght = lenght;
        this.light = light;
    }
    public Place(String name){this.name = name;}

    public String getName() {
        return name;
    }

    @Override
    public String toString(){return "место";}


}
